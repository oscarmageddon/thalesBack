package com.example.test.dto;

/**
 * 
 * @author Oscar Campos
 * 
 * Response contains general response data.
 *
 */
public class Response {
	
	/**
	 * Status of the response.
	 */
	public String status;
	/**
	 * Message of the response.
	 */
	public String message;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
