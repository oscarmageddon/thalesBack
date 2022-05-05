package com.example.test.dto;

import java.util.List;

/**
 * 
 * @author Oscar Campos.
 * 
 * EmployeesResponse is the response for a lot of employees.
 *
 */
public class EmployeesResponse extends Response {

	/**
	 * List of employees obtained.
	 */
	private List<Employee> data;

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}
}
