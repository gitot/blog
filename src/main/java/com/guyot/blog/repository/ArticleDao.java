package com.guyot.blog.repository;

import com.guyot.blog.entity.Article;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends PagingAndSortingRepository<Article,Long> {
}
