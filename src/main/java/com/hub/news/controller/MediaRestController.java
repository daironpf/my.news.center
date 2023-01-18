package com.hub.news.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.Media;
import com.hub.news.service.MediaService;

@RestController
@RequestMapping("/api/v1/media")
public class MediaRestController {
    private final MediaService mediaService;

    public MediaRestController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Media> addCategory(@RequestBody Media media){
        Media newMedia = mediaService.add(media);
        return new ResponseEntity<>(newMedia, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Media>> getAllCategory(){
        List<Media> posts = mediaService.getAll();        
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

}
