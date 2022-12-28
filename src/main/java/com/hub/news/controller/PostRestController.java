package com.hub.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.Post;
import com.hub.news.service.PostService;

@RestController
@RequestMapping("/api/v1/post")
public class PostRestController {
    private final PostService postService;

    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/add")
    public ResponseEntity<Post> addCategory(@RequestBody Post post){
        Post newPost = postService.add(post);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }
    
}
