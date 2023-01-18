package com.hub.news.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.Comment;
import com.hub.news.service.CommentService;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentRestController {
    private final CommentService commentService;

    public CommentRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/add")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment){
    Comment newComment = commentService.add(comment);
    return new ResponseEntity<>(newComment, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comment>> getAllCategory(){
        List<Comment> comments = commentService.getAll();        
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
