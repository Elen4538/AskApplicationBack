package com.askapp.helen.spring.askapplicationback.service;

import com.askapp.helen.spring.askapplicationback.model.Comment;
import com.askapp.helen.spring.askapplicationback.repository.CommentRepository;
import org.springframework.stereotype.Service;

/**
 * @author elena
 * @project AskApplicationBack
 * @date 29/05/2023
 */
@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


}
