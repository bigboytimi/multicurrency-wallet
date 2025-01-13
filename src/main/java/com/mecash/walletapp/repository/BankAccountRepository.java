package com.mecash.walletapp.repository;

import com.mecash.walletapp.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

    BankAccount findByAccountNumberAndBankName(String accountNumber, String bankName);

}
