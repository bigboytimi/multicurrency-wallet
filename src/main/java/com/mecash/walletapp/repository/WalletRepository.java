package com.mecash.walletapp.repository;

import com.mecash.walletapp.model.Currency;
import com.mecash.walletapp.model.WalletAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WalletRepository extends JpaRepository<WalletAccount, Long> {

    WalletAccount findByAccountNumber(String accountNumber);

    List<WalletAccount> findAllByCustomerId(Long accountId);
}
