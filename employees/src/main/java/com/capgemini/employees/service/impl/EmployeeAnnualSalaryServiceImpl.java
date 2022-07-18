package com.capgemini.employees.service.impl;

import org.springframework.stereotype.Service;

import com.capgemini.employees.service.EmployeeAnnualSalaryService;

@Service
public class EmployeeAnnualSalaryServiceImpl implements EmployeeAnnualSalaryService{

	private static final int MONTHS = 12;
	
	@Override
	public Integer getAnnualSalary(Integer employee_salary) {
		return employee_salary * MONTHS;
	}

}
