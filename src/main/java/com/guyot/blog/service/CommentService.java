package com.guyot.blog.service;

import com.guyot.blog.vo.request.CommentRequest;

public interface CommentService {
    /**
     * @param request
     */
    void publish(CommentRequest request);

    /**
     * @param request
     */
    void editor(CommentRequest request);

    /**
     * @param id
     */
    void delete(String id);
}
