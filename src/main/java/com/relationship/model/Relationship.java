/**
 * 
 */
package com.relationship.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.relationship.main.RelationshipStatus;

/**
 * @author sidonepudi
 *
 */
@Entity
@Table(name = "relationship_details")
public class Relationship {

	@EmbeddedId
	private RelationshipKey relationshipKey;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
	private User userOne;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "friend_id", referencedColumnName = "user_id", insertable = false, updatable = false)
	private User userTwo;

	@Column(name = "status")
	private RelationshipStatus relationshipStatus;

	public RelationshipKey getRelationshipKey() {
		return relationshipKey;
	}

	public void setRelationshipKey(RelationshipKey relationshipKey) {
		this.relationshipKey = relationshipKey;
	}

	public RelationshipStatus getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public User getUserOne() {
		return userOne;
	}

	public void setUserOne(User userOne) {
		this.userOne = userOne;
	}

	public User getUserTwo() {
		return userTwo;
	}

	public void setUserTwo(User userTwo) {
		this.userTwo = userTwo;
	}


}
