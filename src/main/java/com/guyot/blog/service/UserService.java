package com.guyot.blog.service;

import com.guyot.blog.vo.request.AccountRequest;

public interface UserService {
    void register(AccountRequest request);

    void login(AccountRequest request);

    void upload(byte[] bytes);
}
