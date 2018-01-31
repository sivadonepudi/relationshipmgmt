/**
 * 
 */
package com.relationship.io;

import java.util.List;

/**
 * @author sidonepudi
 *
 */
public class RelationshipRequest {
	List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> users) {
		this.friends = users;
	}
}
