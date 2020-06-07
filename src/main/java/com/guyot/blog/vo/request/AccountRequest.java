package com.guyot.blog.vo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class AccountRequest {
    @NotEmpty(message = "用户名不能为空")
    private String name;
    @NotEmpty(message = "密码不能为空")
    private String passwordHash;
    @NotEmpty(message = "电话号码不能为空")
    private String phoneNumber;
    @NotEmpty(message = "email不能为空")
    private String email;
    private byte[] photo;
}
