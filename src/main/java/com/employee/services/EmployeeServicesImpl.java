package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entityes.Employee;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
		
	}

	@Override
	public List<Employee> getSaveData() {
		List<Employee> all = empRepo.findAll();
		return all;
		
	}

	@Override
	public void dataDelete(int id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public Employee updateList(int id) {
		Optional<Employee> fd = empRepo.findById(id);
		Employee emp = fd.get();
		return emp;
		
	}

}
