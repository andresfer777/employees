package com.capgemini.employees.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employees.service.EmployeeAnnualSalaryService;
import com.capgemini.employees.service.impl.EmployeeAnnualSalaryServiceImpl;

class EmployeeAnnualSalaryServiceTest {

	@Test
	void test() {
		EmployeeAnnualSalaryService employeeAnnualSalaryService = new EmployeeAnnualSalaryServiceImpl();
		Integer unitaryValue = 10;
		Integer totalValue = employeeAnnualSalaryService.getAnnualSalary(unitaryValue);
		assertEquals(totalValue,120);
	}

}
