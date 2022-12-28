package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.Tag;

public interface TagRepository extends Neo4jRepository<Tag,String>{
    
}
