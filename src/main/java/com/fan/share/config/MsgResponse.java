package com.fan.share.config;

import com.fan.share.constant.HttpResponseStatusEnum;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/7 8:32
 */
public class MsgResponse<T> {

    private boolean success;

    private String code;

    private String msg;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    // 成功返回 1
    public static <T> MsgResponse<T> success(){
        MsgResponse<T> msgResponse = new MsgResponse<>();
        msgResponse.setCode("200");
        msgResponse.setSuccess(true);
        msgResponse.setMsg("success");
        msgResponse.setData(null);
        return msgResponse;
    }

    // 成功返回 2
    public static <T> MsgResponse<T> success(String msg){
        MsgResponse<T> msgResponse = new MsgResponse<>();
        msgResponse.setCode("200");
        msgResponse.setSuccess(true);
        msgResponse.setMsg(msg);
        msgResponse.setData(null);
        return msgResponse;
    }

    // 成功返回 3
    public static <T> MsgResponse<T> success(T obj){
        MsgResponse<T> msgResponse = new MsgResponse<>();
        msgResponse.setCode("200");
        msgResponse.setSuccess(true);
        msgResponse.setMsg("success");
        msgResponse.setData(obj);
        return msgResponse;
    }

    // 成功返回 4
    public static <T> MsgResponse<T> success(String msg,T obj){
        MsgResponse<T> msgResponse = new MsgResponse<>();
        msgResponse.setCode("200");
        msgResponse.setSuccess(true);
        msgResponse.setMsg(msg);
        msgResponse.setData(obj);
        return msgResponse;
    }

    // 失败返回 1
    public static <T> MsgResponse<T> fail(T obj, int code,String msg) {
        MsgResponse<T> response = new MsgResponse<T>();
        response.setCode(String.valueOf(code));
        response.setSuccess(false);
        response.setMsg(msg);
        response.setData(obj);
        return response;
    }

    //失败返回2
    public static <T> MsgResponse<T> fail(int code,String msg) {
        MsgResponse<T> response = new MsgResponse<T>();
        response.setCode(String.valueOf(code));
        response.setSuccess(false);
        response.setMsg(msg);
        response.setData(null);
        return response;
    }
    //失败返回2
    public static <T> MsgResponse<T> fail(String msg) {
        MsgResponse<T> response = new MsgResponse<T>();
        response.setSuccess(false);
        response.setMsg(msg);
        response.setData(null);
        return response;
    }


}
