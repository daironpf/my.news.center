package com.hub.news.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.hub.news.model.UserApp;

public interface UserAppRepository extends Neo4jRepository<UserApp,String> {
    
}
