/**
 * 
 */
package com.relationship.main;

/**
 * @author sidonepudi
 *
 */
public enum RelationshipStatus {
	FRIEND(0), UNFRIEND(1), BLOCK(3);

	private int value;

	private RelationshipStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
