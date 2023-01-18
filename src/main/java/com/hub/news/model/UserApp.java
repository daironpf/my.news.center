package com.hub.news.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import lombok.Data;

@Data
@Node({"User","Editor","Author"})
public class UserApp {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private String name,userName, url, lastname, userTwitter, email;

    public UserApp(String name, String userName, String url, String lastname, String userTwitter, String email) {
        this.name = name;
        this.userName = userName;
        this.url = url;
        this.lastname = lastname;
        this.userTwitter = userTwitter;
        this.email = email;
    }
}
