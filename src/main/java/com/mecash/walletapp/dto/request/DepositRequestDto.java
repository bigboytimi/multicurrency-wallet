package com.mecash.walletapp.dto.request;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class DepositRequestDto {
    @NotBlank(message = "currency missing")
    @Pattern(regexp = "^(NGN|EUR|USD)$")
    private String currency;
    @NotNull(message = "amount missing")
    @DecimalMin(value = "50.00", inclusive = true, message = "Amount must be greater than or equal to 50.00")
    @Digits(integer = 10, fraction = 2, message = "Amount must be a valid number with up to 2 decimal places")
    private BigDecimal amount;
    @NotBlank(message = "account number missing")
    private String walletAccountNumber;
    @NotBlank(message = "source account number missing")
    private String sourceAccountNumber;
    @NotBlank(message = "source bank missing")
    private String sourceAccountBankName;

    private String narration;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getWalletAccountNumber() {
        return walletAccountNumber;
    }

    public void setWalletAccountNumber(String walletAccountNumber) {
        this.walletAccountNumber = walletAccountNumber;
    }

    public String getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    public void setSourceAccountNumber(String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public String getSourceAccountBankName() {
        return sourceAccountBankName;
    }

    public void setSourceAccountBankName(String sourceAccountBankName) {
        this.sourceAccountBankName = sourceAccountBankName;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
