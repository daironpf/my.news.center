package com.hub.news.repository;

import java.util.Collection;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.hub.news.model.Category;

public interface CategoryRepository extends Neo4jRepository <Category,String>{
    
}
