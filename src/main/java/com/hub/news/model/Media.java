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
@Node("Media")
public class Media {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private LocalDate uploadDate;
    private String type,url,title,summary;

    @Relationship(type = "UPLOAD", direction = Direction.INCOMING) 
	private UserApp userUploadMedia;

    public Media(LocalDate uploadDate, String type, String url, String title, String summary) {
        this.uploadDate = uploadDate;
        this.type = type;
        this.url = url;
        this.title = title;
        this.summary = summary;
    }

    
}
