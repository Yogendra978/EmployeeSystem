package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.entityes.Employee;
import com.employee.services.EmployeeServices;

@Controller
public class EmpController {

	@Autowired
	private EmployeeServices emp;
	
	@RequestMapping("/")
	public String myHome() {
		return "index";
	}
	
	
	@RequestMapping("/save")
	public String saveInfoData(@ModelAttribute("l") Employee empl,Model m) {
		emp.saveEmployee(empl);
		m.addAttribute("msg","record save!");
		return "index";
	}
	
	@RequestMapping("/listall")
	public String getData(Model m) {
		List<Employee> list = emp.getSaveData();
		m.addAttribute("list",list);
		System.out.println(list);
		return "list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id,Model model) {
		emp.dataDelete(id);
		
		List<Employee> list = emp.getSaveData();
		model.addAttribute("list",list);
		model.addAttribute("msg","deleted data");
		return "list";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") int id,Model model) {
		Employee up = emp.updateList(id);
		model.addAttribute("up",up);
		return "list_update";
	}
	
	@RequestMapping("/updateData")
	public String updateData(Employee emplo,Model model) {
		emplo.setFristname(emplo.getFristname());
		emplo.setLastname(emplo.getLastname());
		emplo.setEmail(emplo.getEmail());
		emplo.setSkills(emplo.getSkills());
		emplo.setSallery(emplo.getSallery());
		emplo.setMobile(emplo.getMobile());
		emp.saveEmployee(emplo);
		
		List<Employee> list = emp.getSaveData();
		model.addAttribute("list",list);
		model.addAttribute("msg","record is updated!");
		return "list";
	}
}
