package com.mecash.walletapp.dto.response;

import com.mecash.walletapp.dto.WalletBalanceAndCurrency;

import java.util.List;

public class RegistrationResponseDto {

    private String accountName;

    private List<WalletBalanceAndCurrency> wallet;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public List<WalletBalanceAndCurrency> getWallet() {
        return wallet;
    }

    public void setWallet(List<WalletBalanceAndCurrency> wallet) {
        this.wallet = wallet;
    }
}
