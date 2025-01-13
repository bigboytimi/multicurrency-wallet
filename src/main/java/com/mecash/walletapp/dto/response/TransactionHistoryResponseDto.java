package com.mecash.walletapp.dto.response;

import com.mecash.walletapp.model.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionHistoryResponseDto {
    private TransactionType transactionType;
    private BigDecimal amount;
    private LocalDateTime createdTime;
    private String narration;

    public TransactionHistoryResponseDto(TransactionType transactionType, BigDecimal amount, LocalDateTime createdTime, String narration) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.createdTime = createdTime;
        this.narration = narration;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
