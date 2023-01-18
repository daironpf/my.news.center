package com.hub.news.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;

@Data
@Node("Category")
public class Category {     
        @Id @GeneratedValue(UUIDStringGenerator.class)
        private String id;
        private String name,url,description,urlIcon;

        @Relationship(type = "IN_LANGUAGE", direction = Direction.OUTGOING) 
	    private Language categoryInLanguage;

        public Category(String name, String url, String description, String urlIcon) {
            this.name = name;
            this.url = url;
            this.description = description;
            this.urlIcon = urlIcon;
        }
    }
