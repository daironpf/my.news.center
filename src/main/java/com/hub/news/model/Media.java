package com.hub.news.model;

import java.time.LocalDate;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Media")
public class Media {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private LocalDate uploadDate;
    private String type,url,title,summary;
    public Media(LocalDate uploadDate, String type, String url, String title, String summary) {
        this.uploadDate = uploadDate;
        this.type = type;
        this.url = url;
        this.title = title;
        this.summary = summary;
    }

    
}
