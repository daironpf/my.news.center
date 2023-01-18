package com.hub.news.model;

import java.time.LocalDate;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;

@Data
@Node("Comment")
public class Comment {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    
    private LocalDate dateCreate;
    private String content;
    private Boolean approved;

    @Relationship(type = "WROTE", direction = Direction.INCOMING)
    private UserApp userWroteCommet;

    public Comment(LocalDate dateCreate, String content, Boolean approved) {
        this.dateCreate = dateCreate;
        this.content = content;
        this.approved = approved;
    }
}
