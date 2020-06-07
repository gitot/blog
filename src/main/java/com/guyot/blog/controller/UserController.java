package com.guyot.blog.controller;

import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import com.guyot.blog.vo.request.AccountRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @PostMapping(value = "/registration")
    public BaseResponse registration(@RequestBody AccountRequest request) {

        return new BaseResponse(ResultEnum.CREATED);
    }

    @PostMapping(value = "/login")
    public BaseResponse login(@RequestParam String username,
                              @RequestParam String passwd) {

        return new BaseResponse(ResultEnum.OK);
    }

    @PostMapping(value = "/image")
    public BaseResponse login(@RequestPart MultipartFile image) {

        return new BaseResponse(ResultEnum.CREATED);
    }
}
