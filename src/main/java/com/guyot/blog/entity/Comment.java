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
@Table(name = "blog_comment")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 评论id
     */
    @Column(nullable = false)
    private Long id;
    /**
     * 内容
     */
    @Column(nullable = false)
    private String content;
    /**
     * 评论人
     */
    @Column(nullable = false)
    private Long commentUser;
    /**
     * 点赞数
     */
    @Column(nullable = false)
    private Long stars;
    /**
     * 所属文章id
     */
    @Column(nullable = false)
    private Long articleId;
    /**
     * 所属评论id。若直接对文章评论，此值为 null
     */
    @Column
    private Long commentId;
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
