package com.guyot.blog.service;

import com.guyot.blog.vo.request.ArticleRequest;

public interface ArticleService {
    void publish(ArticleRequest request);

    void editor(ArticleRequest request);

    void delete(String id);
}
