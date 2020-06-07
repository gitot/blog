package com.guyot.blog.controller;


import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import com.guyot.blog.vo.request.ArticleRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @PostMapping(value = "publication")
    public BaseResponse publish(@RequestBody ArticleRequest request) {
        return new BaseResponse(ResultEnum.CREATED);
    }

    @PutMapping(value = "editor")
    public BaseResponse editor(@RequestBody ArticleRequest request) {
        return new BaseResponse(ResultEnum.CREATED);
    }

    @DeleteMapping(value = "delete")
    public BaseResponse delete(@RequestParam String id) {
        return new BaseResponse(ResultEnum.OK);
    }
}
