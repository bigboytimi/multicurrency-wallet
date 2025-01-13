package com.mecash.walletapp.service;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.response.TransactionHistoryResponseDto;
import com.mecash.walletapp.model.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountService {
    ResponseEntity<APIResponse<List<TransactionHistoryResponseDto>>> getTransactionHistory(Long transactionHistoryResponseDto);

    void saveTransactionRecord(Transaction transaction);
}
