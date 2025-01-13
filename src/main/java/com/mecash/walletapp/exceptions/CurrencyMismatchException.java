package com.mecash.walletapp.exceptions;

public class CurrencyMismatchException extends RuntimeException{
    private String message;

    public CurrencyMismatchException() {
        super();
        this.message = "Currency mismatch";
    }

    public CurrencyMismatchException(String msg) {
        super(msg);
        this.message = msg;
    }
}
