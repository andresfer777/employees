package com.capgemini.employees.service;

import java.util.List;

import com.capgemini.employees.model.Employee;

public interface EmployeesService {

	List<Employee> retrieveAllEmployees();

	Employee retrieveEmployee(int employee);

}
