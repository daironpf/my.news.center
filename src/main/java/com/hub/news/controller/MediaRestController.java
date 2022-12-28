package com.hub.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}
