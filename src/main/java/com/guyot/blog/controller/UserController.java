package com.guyot.blog.controller;

import com.guyot.blog.service.UserService;
import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import com.guyot.blog.vo.request.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registration")
    public BaseResponse registration(@RequestBody AccountRequest request) {
        userService.register(request);
        return new BaseResponse(ResultEnum.CREATED);
    }

    @PostMapping(value = "/login")
    public BaseResponse login(@RequestBody AccountRequest request) {

        userService.login(request);
        return new BaseResponse(ResultEnum.OK);
    }

    @PostMapping(value = "/image")
    public BaseResponse login(@RequestPart MultipartFile image) throws IOException {
        userService.upload(image.getBytes());
        return new BaseResponse(ResultEnum.CREATED);
    }
}
