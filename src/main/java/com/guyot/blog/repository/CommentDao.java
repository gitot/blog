package com.guyot.blog.repository;

import com.guyot.blog.entity.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao extends PagingAndSortingRepository<Comment, Long> {
}
