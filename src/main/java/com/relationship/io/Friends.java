/**
 * 
 */
package com.relationship.io;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sidonepudi
 *
 */
public class Friends extends RelationshipResponse {
	private Set<String> friends = new HashSet<>();
	private int count;

	public Friends(boolean status) {
		super(status);
	}

	public Set<String> getFriends() {
		return friends;
	}

	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}

	public int getCount() {
		count = friends.size();
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
