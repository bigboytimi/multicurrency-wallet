package com.mecash.walletapp.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class WithdrawRequestDto {
    @NotNull(message = "missing amount to withdraw")
    private BigDecimal withdrawalAmount;
    @NotBlank(message = "account number missing")
    private String walletAccountNumber;
    @NotBlank(message = "currency missing")
    private String currency;
    private String narration;

    public BigDecimal getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(BigDecimal withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getWalletAccountNumber() {
        return walletAccountNumber;
    }

    public void setWalletAccountNumber(String walletAccountNumber) {
        this.walletAccountNumber = walletAccountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
