package com.mecash.walletapp.dto;

import java.math.BigDecimal;


public class WalletBalanceAndCurrency {
    private BigDecimal balance;
    private String currency;

    private String accountNumber;


    public WalletBalanceAndCurrency(BigDecimal balance, String currency, String accountNumber) {
        this.balance = balance;
        this.currency = currency;
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
