package com.hogae.framework.web.model;

import com.hogae.framework.web.enums.AppResponseCode;
import lombok.Data;

@Data
public class AppResponse {

    private String code;

    private String message;

    private Object data;

    public AppResponse(AppResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

    public AppResponse(AppResponseCode responseCode, Object data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }
    public AppResponse(AppResponseCode responseCode, String message) {
        this.code = responseCode.getCode();
        this.message = message;
        this.data = "";
    }

    public AppResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppResponse(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static AppResponse fail(){
        return new AppResponse(AppResponseCode.FAIL);
    }

    public static AppResponse fail(Object data){
        return new AppResponse(AppResponseCode.FAIL,data);
    }

    public static AppResponse success(){
        return new AppResponse(AppResponseCode.SUCCESS);
    }

    public static AppResponse success(Object data){
        return new AppResponse(AppResponseCode.SUCCESS,data);
    }

    public static AppResponse error(){
        return new AppResponse(AppResponseCode.ERROR);
    }

    public static AppResponse error(Object data){
        return new AppResponse(AppResponseCode.ERROR,data);
    }

    public static AppResponse error(Exception e){
        return new AppResponse(AppResponseCode.ERROR,e.getMessage());
    }

    public static AppResponse error(String message){
        return new AppResponse(AppResponseCode.ERROR,message);
    }

}
