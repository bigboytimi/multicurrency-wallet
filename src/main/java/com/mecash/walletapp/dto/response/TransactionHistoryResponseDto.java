package com.mecash.walletapp.dto.response;

import com.mecash.walletapp.model.Transaction;
import com.mecash.walletapp.model.TransactionType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
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
}
