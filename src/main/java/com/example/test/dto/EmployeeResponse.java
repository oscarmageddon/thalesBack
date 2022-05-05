package com.example.test.dto;

/**
 * 
 * @author Oscar Campos.
 * 
 * EmployeeResponse is the response for an employee.
 *
 */
public class EmployeeResponse extends Response {

	/**
	 * Employee obtained
	 */
	private Employee data;

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}
}
