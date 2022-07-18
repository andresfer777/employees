package com.capgemini.employees.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.capgemini.employees.model.Employee;
import com.capgemini.employees.model.PluralResponse;
import com.capgemini.employees.model.SingularResponse;
import com.capgemini.employees.repository.EmployeesRepository;

@Repository
public class EmployeesRepositoryImpl implements EmployeesRepository {
	
	private static final String ALL_USERS = "http://dummy.restapiexample.com/api/v1/employees";
	private static final String ONE_USER = "http://dummy.restapiexample.com/api/v1/employee/";
	
	@Override
	public List<Employee> retrieveAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Karen", 34343, 24, ""));
		employees.add(new Employee(2, "Sam", 436356, 45, ""));
		
		RestTemplate template = new RestTemplate();
		PluralResponse response = template.getForObject(ALL_USERS, PluralResponse.class);
		employees = response.getData();
		
		return employees;
	}

	@Override
	public Employee retrieveOneEmployee(int employee) {
		
		RestTemplate template = new RestTemplate();
		SingularResponse response = template.getForObject(ONE_USER + employee, SingularResponse.class);
		return response.getData();
	}

}
