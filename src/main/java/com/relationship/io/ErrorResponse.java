/**
 * 
 */
package com.relationship.io;

/**
 * @author sidonepudi
 *
 */
public class ErrorResponse {
	private Error errorCode;
	private String errorMessage;

	public ErrorResponse(Error errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Error getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Error errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
