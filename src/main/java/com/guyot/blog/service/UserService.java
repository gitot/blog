package com.guyot.blog.service;

import com.guyot.blog.vo.request.AccountRequest;

public interface UserService {
    /**
     * @param request
     */
    void register(AccountRequest request);

    /**
     * @param request
     */
    void login(AccountRequest request);

    /**
     * @param bytes
     */
    void upload(byte[] bytes);
}
