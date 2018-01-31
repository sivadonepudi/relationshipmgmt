/**
 * 
 */
package com.relationship.exception;

/**
 * @author sidonepudi
 *
 */
public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1056095302575288144L;

	public UserNotFoundException(Error error) {
		super(error);
	}

}
