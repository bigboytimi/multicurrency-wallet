package com.mecash.walletapp.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Data
public class ApiException extends RuntimeException {

    private String message;
    public ApiException(String msg) {
        super(msg);
        this.message = msg;
    }

}
