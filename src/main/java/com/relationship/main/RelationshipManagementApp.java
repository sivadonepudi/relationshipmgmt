/**
 * 
 */
package com.relationship.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sidonepudi
 *
 */
@SpringBootApplication
@ComponentScan({ "com.relationship.controller", "com.relationship.service" })
@EnableJpaRepositories("com.relationship.repository")
@EntityScan("com.relationship.model")
public class RelationshipManagementApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RelationshipManagementApp.class, args);
	}
}
