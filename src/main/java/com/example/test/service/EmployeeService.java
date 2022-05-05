package com.example.test.service;

import org.springframework.web.client.RestTemplate;

import com.example.test.dto.EmployeeResponse;
import com.example.test.dto.EmployeesResponse;


public class EmployeeService {

	private String employeesUrl;
	private String employeeUrl;
	
	public EmployeeService() {
		this.employeesUrl = "http://dummy.restapiexample.com/api/v1/employees";
		this.employeeUrl = "http://dummy.restapiexample.com/api/v1/employee/";
	}

	public EmployeesResponse getEmployees() {
		RestTemplate restTemp = new RestTemplate();
		EmployeesResponse response = restTemp.getForObject(employeesUrl, EmployeesResponse.class);
		return response;
	}
	
	public EmployeeResponse getEmployee(Integer id) {
		RestTemplate restTemp = new RestTemplate();
		EmployeeResponse response = restTemp.getForObject(employeeUrl + id, EmployeeResponse.class);
		return response;
	}
}
