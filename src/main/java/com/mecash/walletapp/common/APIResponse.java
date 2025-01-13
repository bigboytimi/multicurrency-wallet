package com.mecash.walletapp.common;

import lombok.*;


public class APIResponse<T>{

    private String code;
    private String status;
    private T data;

    public APIResponse(String code, String status, T data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
