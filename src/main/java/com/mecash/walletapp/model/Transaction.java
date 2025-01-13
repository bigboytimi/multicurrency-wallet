package com.mecash.walletapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transaction_data")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_account_id", nullable = false)
    private WalletAccount walletAccount;

    @Getter
    private String narration;

    @Getter
    private BigDecimal amount;

    @Getter
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @CreatedDate
    private LocalDateTime transactionDate;

    public Transaction(BigDecimal amount, TransactionType transactionType, WalletAccount walletAccount, String narration) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.walletAccount = walletAccount;
        this.narration = narration;
        this.transactionDate = LocalDateTime.now();
    }

    public Transaction() {

    }

    public WalletAccount getWalletAccount() {
        return walletAccount;
    }

    public String getNarration() {
        return narration;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setWalletAccount(WalletAccount walletAccount) {
        this.walletAccount = walletAccount;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
