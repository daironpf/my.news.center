package com.hub.news.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Tag")
public class Tag {
    @Id @GeneratedValue(UUIDStringGenerator.class)
        private String id;
        private String name,url,urlIcon;

        public Tag(String name, String url, String urlIcon) {
            this.name = name;
            this.url = url;
            this.urlIcon = urlIcon;
        }
}
