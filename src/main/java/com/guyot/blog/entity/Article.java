package com.guyot.blog.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog_article")
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 博文Id
     */
    @Column(nullable = false)
    private Long id;
    /**
     * 博文题目
     */
    @Column(nullable = false)
    private String title;
    /**
     * 博文内容
     */
    @Column(nullable = false)
    private String content;
    /**
     * 发布人
     */
    @Column(nullable = false)
    private Long publish_user;
    /**
     * 点赞数量
     */
    @Column(nullable = false)
    private Long stars;
    /**
     * 创建时间
     */
    @Column(nullable = false,updatable = false)
    @CreationTimestamp
    private Date createTime;
    /**
     * 更新时间
     */
    @Column(nullable = false)
    @UpdateTimestamp
    private Date updatedTime;
}
