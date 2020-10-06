package com.fan.share.constant;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/10/6 16:31
 */
public enum  HttpResponseStatusEnum {
    // 成功请求
    SUCCESS("0", "success"),
    // 权限不足
    FORBIDDEN_OPERATION("2", "forbidden");


    private String code;
    private String message;

    HttpResponseStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    public Object getResult() {
        return null;
    }

}
