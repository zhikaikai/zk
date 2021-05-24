package com.hogae.framework.web.enums;

public enum AppResponseCode {

    SUCCESS("1000","执行成功！"),
    FAIL("1001","执行失败！"),
    ERROR("1002","服务器错误！");


    private String code;

    private String message;

    AppResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
