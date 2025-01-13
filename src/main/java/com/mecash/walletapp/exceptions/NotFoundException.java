package com.mecash.walletapp.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Data
public class NotFoundException extends RuntimeException {


    private String message;

    public NotFoundException() {
        super();
        this.message = "Record not found";
    }

    public NotFoundException(String msg) {
        super(msg);
        this.message = msg;
    }
}
