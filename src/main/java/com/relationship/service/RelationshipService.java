/**
 * 
 */
package com.relationship.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationship.exception.UserNotFoundException;
import com.relationship.main.RelationshipStatus;
import com.relationship.model.Relationship;
import com.relationship.model.RelationshipKey;
import com.relationship.model.User;
import com.relationship.repository.RelationshipRepository;
import com.relationship.repository.UserRepository;

/**
 * @author sidonepudi
 *
 */
@Service
public class RelationshipService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RelationshipRepository relationshipRepository;

	public void buildRelationship(String userEmail, String userTwoEmail, RelationshipStatus status) {

		User user = persistUser(userEmail);
		User friend = persistUser(userTwoEmail);

		RelationshipKey relationshipKey = new RelationshipKey();
		relationshipKey.setUserId(user.getUserId());
		relationshipKey.setFriendId(friend.getUserId());

		Relationship relationship = new Relationship();
		relationship.setRelationshipKey(relationshipKey);
		relationship.setRelationshipStatus(status);
		relationshipRepository.save(relationship);
		
		RelationshipKey relationshipKey2 = new RelationshipKey();
		relationshipKey2.setUserId(friend.getUserId());
		relationshipKey2.setFriendId(user.getUserId());
		
		Relationship relationship2 = new Relationship();
		relationship2.setRelationshipKey(relationshipKey2);
		relationship2.setRelationshipStatus(status);
		relationshipRepository.save(relationship2);
	}

	private User persistUser(String email) {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			user = new User();
			user.setEmail(email);
		}
		userRepository.save(user);
		return user;
	}

	public Set<String> mutualRelations(String userEmail, String friendEmail) throws UserNotFoundException {
		Set<String> userFriends = retrieveFriends(userEmail, RelationshipStatus.FRIEND);
		Set<String> friendFriends = retrieveFriends(friendEmail, RelationshipStatus.FRIEND);
		userFriends.retainAll(friendFriends);
		return userFriends;
	}

	public Set<String> retrieveFriends(String email, RelationshipStatus relationshipStatus) throws UserNotFoundException {
		Set<String> friends = new HashSet<String>();
		User user = userRepository.findByEmail(email);
		if(user == null) {
			throw new UserNotFoundException(new Error(email + " doesn't exists."));
		}
		List<Relationship> relations = user.getRelationships();
		for (Relationship relation : relations) {
			if (relationshipStatus.equals(relation.getRelationshipStatus())) {
				friends.add(relation.getUserTwo().getEmail());
			}
		}
		return friends;
	}

	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	public List<Relationship> getRelationships() {
		return (List<Relationship>) relationshipRepository.findAll();
	}

}
