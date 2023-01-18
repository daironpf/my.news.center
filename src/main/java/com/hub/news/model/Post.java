package com.hub.news.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;

@Data
@Node("Post")
public class Post {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;

        private String content,title,description,summary,leaps,place;
        private LocalDate updateMoment,publishDate;

        @Relationship(type = "IN_LANGUAGE", direction = Direction.OUTGOING) 
	    private Language postInLanguage;

        @Relationship(type = "IN_CATEGORY", direction = Direction.OUTGOING) 
	    private List<Category> postInCategory;

        @Relationship(type = "HAS_TAG", direction = Direction.OUTGOING)
        private List<Tag> postInTag;

        @Relationship(type = "BELONGS_TO", direction = Direction.INCOMING)
        private List<Comment> commentBelongsInThisPost;

        @Relationship(type = "CONTAINS", direction = Direction.OUTGOING)
        private List<Media> postContainsMedia;

        @Relationship(type = "HAS_EDITED", direction = Direction.INCOMING) 
        private List<UserEditedPost>editOfPost;

        @Relationship(type = "CREATE", direction = Direction.INCOMING) 
        private UserCreatePost userCreatePost;


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
