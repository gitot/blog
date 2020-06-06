package com.guyot.blog.vo;

/**
 * Base response message to be returned to the client.
 */
public class BaseResponse {
    private int code;
    private String msg;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BaseResponse(ResultEnum resultEnum) {
        this.code = resultEnum.value();
        this.msg = resultEnum.getReasonPhrase();
    }
    public BaseResponse(ResultEnum resultEnum,String desc) {
        this.code = resultEnum.value();
        this.msg = resultEnum.getReasonPhrase();
        this.desc = desc;
    }
}
