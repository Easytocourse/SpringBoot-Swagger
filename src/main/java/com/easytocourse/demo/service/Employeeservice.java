package com.easytocourse.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easytocourse.demo.dao.EmployeeRepository;
import com.easytocourse.demo.model.Employee;

@Service
public class Employeeservice {
	
	@Autowired
	EmployeeRepository emprepo;

	public void saveemp(Employee emp) {
		 emprepo.save(emp);
		 
	}

	public List<Employee> getallemloyees() {
		return emprepo.findAll();
	}

	public Optional<Employee> getempbyid(int id) {
		return emprepo.findById(id);
	}
	
}
