package com.hub.news.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.Tag;
import com.hub.news.service.TagService;

@RestController
@RequestMapping("/api/v1/tag")
public class TagRestController {
    private final TagService tagService;

    public TagRestController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping("/add")
    public ResponseEntity<Tag> addCategory(@RequestBody Tag tag){
        Tag newTag = tagService.add(tag);
        return new ResponseEntity<>(newTag, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tag>> getAllCategory(){
        List<Tag> tags = tagService.getAll();        
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }
}
