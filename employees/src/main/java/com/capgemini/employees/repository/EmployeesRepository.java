package com.capgemini.employees.repository;

import java.util.List;

import com.capgemini.employees.model.Employee;

public interface EmployeesRepository {

	List<Employee> retrieveAllEmployees();

	Employee retrieveOneEmployee(int employee);

}
