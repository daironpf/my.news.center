package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.Post;

public interface PostRepository extends Neo4jRepository<Post,String> {
    
}
