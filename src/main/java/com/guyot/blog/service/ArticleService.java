package com.guyot.blog.service;

import com.guyot.blog.vo.request.ArticleRequest;

public interface ArticleService {
    /**
     * @param request
     */
    void publish(ArticleRequest request);

    /**
     * @param request
     */
    void editor(ArticleRequest request);

    /**
     * @param id
     */
    void delete(String id);
}
