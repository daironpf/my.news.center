package com.hub.news.model;

import java.time.LocalDate;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;

@Data
@RelationshipProperties
public class UserEditedPost {    
    @RelationshipId 
    private Long id;

    private LocalDate updateMoment;

    @TargetNode
	private final UserApp userApp;

    public UserEditedPost(LocalDate updateMoment, UserApp userApp) {
        this.updateMoment = updateMoment;
        this.userApp = userApp;
    }
}
