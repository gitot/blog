package com.guyot.blog.repository;

import com.guyot.blog.entity.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends PagingAndSortingRepository<Long, Account> {

}
