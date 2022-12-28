package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.Category;

public interface CategoryRepository extends Neo4jRepository <Category,String>{
    
}
