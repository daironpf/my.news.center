package com.hub.news.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Category")
public class Category {     
        @Id @GeneratedValue(UUIDStringGenerator.class)
        private String id;
        private String name,url,description,urlicon;

        public Category(String name, String url, String description, String urlicon) {
            this.name = name;
            this.url = url;
            this.description = description;
            this.urlicon = urlicon;
        }
    }
