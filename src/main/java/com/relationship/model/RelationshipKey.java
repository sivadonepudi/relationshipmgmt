/**
 * 
 */
package com.relationship.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author sidonepudi
 *
 */
@Embeddable
public class RelationshipKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1944391567396467583L;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "friend_id")
	private int friendId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

}
