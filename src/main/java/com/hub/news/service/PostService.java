package com.hub.news.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hub.news.model.Post;
import com.hub.news.repository.PostRepository;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional
    public Post add(Post post){
        return postRepository.save(post);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
