package com.mecash.walletapp.model;

import com.mecash.walletapp.utils.AccountUtil;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account_data")
@EntityListeners(AuditingEntityListener.class)
public class WalletAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String accountNumber = AccountUtil.generateRandomStringAccount();

    @Enumerated(EnumType.STRING)
    private Currency currency;
    private BigDecimal accountBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "walletAccount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createdTime;

    @LastModifiedDate
    private LocalDateTime modifiedTime;
    public WalletAccount(Currency currency, BigDecimal accountBalance, Customer customer) {
        this.currency = currency;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    public WalletAccount() {
        this.accountNumber = AccountUtil.generateRandomStringAccount();
    }

    public void addTransaction(Transaction transaction) {
        List<Transaction> transactionList = getTransactions();
        if (transactionList.isEmpty()){
            transactions.add(transaction);
        }
        transactionList.add(transaction);
        transaction.setWalletAccount(this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
