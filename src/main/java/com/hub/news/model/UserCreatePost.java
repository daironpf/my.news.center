package com.hub.news.model;

import java.time.LocalDate;

import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import lombok.Data;

@Data
@RelationshipProperties
public class UserCreatePost {
    @RelationshipId 
    private Long id;

    private LocalDate created;

    @TargetNode
	private final UserApp userApp;

    public UserCreatePost(LocalDate created, UserApp userApp) {
        this.created = created;
        this.userApp = userApp;
    }
    
}
