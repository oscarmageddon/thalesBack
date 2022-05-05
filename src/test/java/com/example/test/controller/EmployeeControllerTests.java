package com.example.test.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeControllerTests {
	
	EmployeeController employeeController = new EmployeeController();
	
	@Test
	public final void getEmployeesTest() {
		assertTrue(employeeController.getEmployees().getBody().getData().size() > 0);
	}
	
	@Test
	public final void getEmployeeTest() {
		assertTrue(employeeController.getEmployee(1).getBody().getData().getId() == 1);
	}
}
