/**
 * 
 */
package com.relationship.io;

/**
 * @author sidonepudi
 *
 */
public class ErrorResponse {
	private String errorMessage;

	public ErrorResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
