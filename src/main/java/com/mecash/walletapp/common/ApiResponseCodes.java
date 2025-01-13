package com.mecash.walletapp.common;

public enum ApiResponseCodes {

    SUCCESS("00", "Operation Successful."),
    FAILED("01", "Operation Failed."),
    PENDING("02", "Operation Processing.");

    private final String code;
    private final String status;

    ApiResponseCodes(String code, String status) {
        this.code = code;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}

