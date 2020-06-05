package com.guyot.blog.repository;

import com.guyot.blog.App;
import com.guyot.blog.entity.Account;
import com.guyot.blog.entity.Article;
import com.guyot.blog.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private CommentDao commentDao;

    @Test
    public void test_add_a_account() {
        Account account = Account.builder()
                .name("guyot")
                .email("1571337712@qq.com")
                .build();
        accountDao.save(account);
        assertEquals(1L, accountDao.count());
    }



    @Test
    public void test_add_a_record_in_each_table() {
        accountDao.deleteAll();
        Account account = Account.builder()
                .name("guyot")
                .phoneNumber("15001919175")
                .email("1571337712@qq.com")
                .passwordHash("tbagonbjf546bsgj")
                .build();
        Account returnAccount = accountDao.save(account);
        assertEquals(1L, accountDao.count());

        articleDao.deleteAll();
        Article article = Article.builder()
                .publish_user(returnAccount.getId())
                .title("如何学习java语言")
                .content("唯手熟而")
                .stars(0L)
                .build();
        Article returnArticle = articleDao.save(article);
        assertEquals(1L, articleDao.count());

        commentDao.deleteAll();
        Comment comment = Comment.builder()
                .articleId(returnArticle.getId())
                .commentUser(account.getId())
                .content("讲的好(自吹自擂)")
                .stars(0L)
                .build();
        commentDao.save(comment);
        assertEquals(1L, commentDao.count());

    }
}
