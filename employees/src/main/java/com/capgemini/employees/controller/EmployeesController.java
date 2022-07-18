package com.capgemini.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employees.model.Employee;
import com.capgemini.employees.service.EmployeesService;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesService service;

	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees() {
		return service.retrieveAllEmployees();
	}
	
	@GetMapping("/employees/{employee}")
	public Employee retrieveEmployee(@PathVariable int employee) {
		return service.retrieveEmployee(employee);
	}
}
