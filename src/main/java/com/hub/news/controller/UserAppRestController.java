package com.hub.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.UserApp;
import com.hub.news.service.UserAppService;

@RestController
@RequestMapping("/api/v1/user")
public class UserAppRestController {
    private final UserAppService userAppService;

    public UserAppRestController(UserAppService userAppService) {
        this.userAppService = userAppService;
    }

     @PostMapping("/add")
    public ResponseEntity<UserApp> addCategory(@RequestBody UserApp userApp){
        UserApp newUserApp = userAppService.add(userApp);
        return new ResponseEntity<>(newUserApp, HttpStatus.CREATED);
    }
}
