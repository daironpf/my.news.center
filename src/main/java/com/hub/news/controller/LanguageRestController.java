package com.hub.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hub.news.model.Language;
import com.hub.news.service.LanguageService;

@RestController
@RequestMapping("/api/v1/language")
public class LanguageRestController {
        private final LanguageService LanguageService;

    public LanguageRestController(LanguageService LanguageService) {
        this.LanguageService = LanguageService;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Language> addLanguage(@RequestBody Language Language){
        Language newLanguage = LanguageService.add(Language);
        return new ResponseEntity<>(newLanguage, HttpStatus.CREATED);
    }
}
