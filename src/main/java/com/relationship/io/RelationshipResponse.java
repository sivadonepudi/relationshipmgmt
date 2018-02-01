/**
 * 
 */
package com.relationship.io;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.ws.rs.core.Link;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author sidonepudi
 *
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "links" })
public class RelationshipResponse {
	@JsonProperty("links")
	@Valid
	private List<Link> links = new ArrayList<Link>();

	@JsonProperty("success")
	@Valid
	private boolean success;

	@JsonProperty("links")
	@JsonIgnore
	public List<Link> getLinks() {
		return links;
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public RelationshipResponse(boolean success) {
		this.success = success;
	}
	
	@JsonProperty("success")
	public boolean isStatus() {
		return success;
	}

}
