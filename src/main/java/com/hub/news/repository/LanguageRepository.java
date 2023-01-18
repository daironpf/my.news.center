package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.hub.news.model.Language;


public interface LanguageRepository extends Neo4jRepository <Language, String> {
    
}
