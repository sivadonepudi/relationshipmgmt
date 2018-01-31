/**
 * 
 */
package com.relationship.controller;

import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.io.Friends;
import com.relationship.io.RelationshipRequest;
import com.relationship.io.RelationshipResponse;
import com.relationship.main.RelationshipStatus;
import com.relationship.service.RelationshipService;

/**
 * @author sidonepudi
 *
 */
@RestController
@RequestMapping("/relationship")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class RelationshipController {

	@Autowired
	RelationshipService relationshipService;

	@PUT
	@RequestMapping("/connect")
	public Response addRelations(@RequestBody RelationshipRequest request) {
		relationshipService.buildRelationship(request.getFriends().get(0), request.getFriends().get(1),
				RelationshipStatus.FRIEND);
		RelationshipResponse response = new RelationshipResponse(true);
		return Response.ok(response).build();
	}

	@PUT
	@RequestMapping("/disconnect")
	public Response releaseRelations(@RequestBody RelationshipRequest request) {
		relationshipService.buildRelationship(request.getFriends().get(0), request.getFriends().get(1),
				RelationshipStatus.UNFRIEND);
		RelationshipResponse response = new RelationshipResponse(true);
		return Response.ok(response).build();
	}

	@PUT
	@RequestMapping("/block")
	public Response blockRelations(@RequestBody RelationshipRequest request) {
		relationshipService.buildRelationship(request.getFriends().get(0), request.getFriends().get(1),
				RelationshipStatus.BLOCK);
		RelationshipResponse response = new RelationshipResponse(true);
		return Response.ok(response).build();
	}

	@PUT
	@RequestMapping("/common")
	public Response commonRelations(@RequestBody RelationshipRequest request) {
		Set<String> mutualRelations = relationshipService.mutualRelations(request.getFriends().get(0),
				request.getFriends().get(1));
		Friends response = new Friends(true);
		response.setFriends(mutualRelations);
		return Response.ok(response).build();
	}

	@GET
	@RequestMapping("/{email}")
	public Response getFriends(@PathVariable String email) {
		Set<String> friends = relationshipService.retrieveFriends(email, RelationshipStatus.FRIEND);
		Friends response = new Friends(true);
		response.setFriends(friends);
		return Response.ok(response).build();
	}

}
