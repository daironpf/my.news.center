package com.hub.news.model;

import java.time.LocalDate;
import java.util.Date;


import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node("Post")
public class Post {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;

        private String content,title,description,summary,leaps,place;
        private LocalDate updateMoment,publishDate;

        public Post(String content, String title, String description, String summary, String leaps, String place,
                LocalDate updateMoment, LocalDate publishDate) {
            this.content = content;
            this.title = title;
            this.description = description;
            this.summary = summary;
            this.leaps = leaps;
            this.place = place;
            this.updateMoment = updateMoment;
            this.publishDate = publishDate;
        }
}
