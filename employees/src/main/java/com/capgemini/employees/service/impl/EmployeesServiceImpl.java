package com.capgemini.employees.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employees.model.Employee;
import com.capgemini.employees.repository.EmployeesRepository;
import com.capgemini.employees.service.EmployeeAnnualSalaryService;
import com.capgemini.employees.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	EmployeesRepository repository;
	
	@Autowired
	EmployeeAnnualSalaryService employeeAnnualSalaryService;
	
	@Override
	public List<Employee> retrieveAllEmployees() {
		List<Employee> employees = repository.retrieveAllEmployees();
		for(Employee employee : employees) {
			employee.setEmployee_annual_salary(employeeAnnualSalaryService.getAnnualSalary(employee.getEmployee_salary()));
		}
		return employees;
	}

	@Override
	public Employee retrieveEmployee(int idEmployee) {
		Employee employee = repository.retrieveOneEmployee(idEmployee);
		employee.setEmployee_annual_salary(employeeAnnualSalaryService.getAnnualSalary(employee.getEmployee_salary()));
		return employee;
	}

}
