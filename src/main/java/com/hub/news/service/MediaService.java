package com.hub.news.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hub.news.model.Media;
import com.hub.news.repository.MediaRepository;

@Service
public class MediaService {
    private final MediaRepository mediaRepository;

    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Transactional
    public Media add(Media media){
        return mediaRepository.save(media);
    }

    public List<Media> getAll() {
        return mediaRepository.findAll();
    }
}
