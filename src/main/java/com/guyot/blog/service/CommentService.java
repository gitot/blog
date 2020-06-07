package com.guyot.blog.service;

import com.guyot.blog.vo.request.CommentRequest;

public interface CommentService {
    void publish(CommentRequest request);

    void editor(CommentRequest request);

    void delete(String id);
}
