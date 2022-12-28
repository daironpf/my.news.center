package com.hub.news.model;

import java.time.LocalDate;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Comment")
public class Comment {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private LocalDate dateCreate;
    private String content;
    private Boolean approved;
    public Comment(LocalDate dateCreate, String content, Boolean approved) {
        this.dateCreate = dateCreate;
        this.content = content;
        this.approved = approved;
    }
}
