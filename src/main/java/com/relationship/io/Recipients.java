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
public class Recipients extends RelationshipResponse {
	private Set<String> recipients = new HashSet<>();

	public Recipients(boolean status) {
		super(status);
	}

	public Set<String> getRecipients() {
		return recipients;
	}

	public void setRecipients(Set<String> friends) {
		this.recipients = friends;
	}

}
