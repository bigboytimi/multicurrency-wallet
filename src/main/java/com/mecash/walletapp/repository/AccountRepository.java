package com.mecash.walletapp.repository;

import com.mecash.walletapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByWalletAccountId(Long walletId);
}
