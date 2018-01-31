/**
 * 
 */
package com.relationship.io;

/**
 * @author sidonepudi
 *
 */
public class RelationshipResponse {
	private boolean status;

	public RelationshipResponse(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
