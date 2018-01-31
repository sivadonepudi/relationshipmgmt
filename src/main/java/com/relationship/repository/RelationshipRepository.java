/**
 * 
 */
package com.relationship.repository;

import org.springframework.data.repository.CrudRepository;

import com.relationship.model.Relationship;
import com.relationship.model.RelationshipKey;

/**
 * @author sidonepudi
 *
 */
public interface RelationshipRepository extends CrudRepository<Relationship, RelationshipKey>{

}
