package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.Media;

public interface MediaRepository extends Neo4jRepository<Media,String> {
    
}
