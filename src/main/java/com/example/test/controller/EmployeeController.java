package com.example.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.EmployeeResponse;
import com.example.test.dto.EmployeesResponse;
import com.example.test.service.EmployeeService;

@RestController
@RequestMapping(value = "testApi/")
public class EmployeeController {

	private EmployeeService empService;

	public EmployeeController() {
		this.empService = new EmployeeService();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("getEmployees")
	public ResponseEntity<EmployeesResponse> getEmployees() {
		try {
			EmployeesResponse response = empService.getEmployees();
			return new ResponseEntity<EmployeesResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			EmployeesResponse response = new EmployeesResponse();
			response.setMessage("Internal Server Error");
			response.setStatus("500");
			return new ResponseEntity<EmployeesResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("getEmployee/{id}")
	public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable("id") Integer id) {
		try {
			EmployeeResponse response = empService.getEmployee(id);
			return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
		} catch (Exception e) {
			EmployeeResponse response = new EmployeeResponse();
			response.setMessage("Internal Server Error");
			response.setStatus("500");
			return new ResponseEntity<EmployeeResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
