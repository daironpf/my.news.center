package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.Comment;

public interface CommentRepository extends Neo4jRepository<Comment,String>{
    
}
