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
@Table(name = "blog_account")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 账户Id
     */
    @Column(nullable = false)
    private Long id;
    /**
     * 用户名
     */
    @Column(nullable = false)
    private String username;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码哈希值
     */
    @Column(nullable = false)
    private String passwordHash;
    /**
     * 电话号码
     */
    @Column(nullable = false)
    private String phoneNumber;
    /**
     * email
     */
    @Column(nullable = false)
    private String email;
    /**
     * 图片
     */
    @Lob
    @Basic
    private byte[] photo;
    /**
     * 创建时间
     */
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date createTime;
    /**
     * 更新时间
     */
    @Column(nullable = false)
    @UpdateTimestamp
    private Date updatedTime;
}
