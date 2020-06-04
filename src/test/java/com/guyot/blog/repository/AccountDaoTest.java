package com.guyot.blog.repository;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void test_add_a_account() {
        long count = accountDao.count();
        assertThat(count, equalTo(0));
    }
}
