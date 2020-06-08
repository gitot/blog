package com.guyot.blog.controller;


import com.guyot.blog.service.CommentService;
import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import com.guyot.blog.vo.request.CommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "publication")
    public BaseResponse publish(@RequestBody CommentRequest request) {
        commentService.publish(request);
        return new BaseResponse(ResultEnum.CREATED);
    }

    @PutMapping(value = "editor")
    public BaseResponse editor(@RequestBody CommentRequest request) {
        commentService.editor(request);
        return new BaseResponse(ResultEnum.CREATED);
    }

    @DeleteMapping(value = "delete")
    public BaseResponse delete(@RequestParam String id) {
        commentService.delete(id);
        return new BaseResponse(ResultEnum.OK);
    }
}
