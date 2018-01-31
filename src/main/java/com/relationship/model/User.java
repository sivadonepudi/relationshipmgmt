/**
 * 
 */
package com.relationship.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author sidonepudi
 *
 */
@Entity
@Table(name="user_details")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;

	@Column(name = "email", nullable=false)
	private String email;
	
	@OneToMany(mappedBy = "relationshipKey.userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Relationship> friends;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Relationship> getRelationships() {
		return friends;
	}

	public void setFriends(List<Relationship> friends) {
		this.friends = friends;
	}
	
}
