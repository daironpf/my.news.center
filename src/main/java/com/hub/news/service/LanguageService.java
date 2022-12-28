package com.hub.news.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hub.news.model.Language;
import com.hub.news.repository.LanguageRepository;

@Service
public class LanguageService {
        private final LanguageRepository LanguageRepository;

    public LanguageService(LanguageRepository LanguageRepository) {
        this.LanguageRepository = LanguageRepository;
    }

    @Transactional
    public Language add(Language language) {
        return LanguageRepository.save(language);
    }
}
