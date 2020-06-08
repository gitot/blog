package com.guyot.blog.controller;


import com.guyot.blog.service.ArticleService;
import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import com.guyot.blog.vo.request.ArticleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping(value = "publication")
    public BaseResponse publish(@RequestBody ArticleRequest request) {
        articleService.publish(request);
        return new BaseResponse(ResultEnum.CREATED);
    }

    @PutMapping(value = "editor")
    public BaseResponse editor(@RequestBody ArticleRequest request) {
        articleService.editor(request);
        return new BaseResponse(ResultEnum.CREATED);
    }

    @DeleteMapping(value = "delete")
    public BaseResponse delete(@RequestParam String id) {
        articleService.delete(id);
        return new BaseResponse(ResultEnum.OK);
    }
}
