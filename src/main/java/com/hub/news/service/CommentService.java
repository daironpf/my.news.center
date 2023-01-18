package com.hub.news.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hub.news.model.Comment;
import com.hub.news.repository.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Transactional
    public Comment add(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }
}
