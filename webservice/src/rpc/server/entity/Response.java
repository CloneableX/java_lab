package com.clo.ws.rpc.server.entity;

/**
 * com.clo.ws.rpc.server.entity.Response
 *
 * @author Cloneable
 * @date 2019/4/5 15:45:05
 * @description response for web service server
 */
public class Response<T> {
    private Integer code;
    private String message;
    private T data;

    public Response getSuccessResp(T data) {
        this.code = 1;
        this.message = "success";
        this.data = data;

        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
