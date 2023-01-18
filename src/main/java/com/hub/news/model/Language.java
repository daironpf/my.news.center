package com.hub.news.model;


import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;


@Data
@Node("Language")
public class Language {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private String name, url, abbreviation, urlFlag;
    private Boolean status;

    public Language(String name, String url, String abbreviation, String urlFlag, Boolean status) {
        this.name = name;
        this.url = url;
        this.abbreviation = abbreviation;
        this.urlFlag = urlFlag;
        this.status = status;
    }
}
