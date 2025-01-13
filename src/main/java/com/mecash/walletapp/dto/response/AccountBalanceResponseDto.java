package com.mecash.walletapp.dto.response;

import com.mecash.walletapp.model.Currency;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class AccountBalanceResponseDto {
    private BigDecimal accountBalance;
    private String accountNumber;
    private Currency currency;

    public AccountBalanceResponseDto(BigDecimal accountBalance, String accountNumber, Currency currency) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
