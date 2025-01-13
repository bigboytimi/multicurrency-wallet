package com.mecash.walletapp.service.impl;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.common.ApiResponseCodes;
import com.mecash.walletapp.dto.response.TransactionHistoryResponseDto;
import com.mecash.walletapp.exceptions.ApiException;
import com.mecash.walletapp.model.Transaction;
import com.mecash.walletapp.repository.AccountRepository;
import com.mecash.walletapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public ResponseEntity<APIResponse<List<TransactionHistoryResponseDto>>> getTransactionHistory(Long accountId) {
        List<Transaction> transactionList = accountRepository.findByWalletAccountId(accountId);

        if (transactionList.isEmpty()) {
            throw new ApiException(String.format("No transaction history found for wallet Id %s", accountId));
        }

        List<TransactionHistoryResponseDto> transactionHistoryResponseDtoList = mapToResponse(transactionList);
        return ResponseEntity.ok(setSuccessResponse(transactionHistoryResponseDtoList));
    }

    @Override
    public void saveTransactionRecord(Transaction transaction) {
        accountRepository.save(transaction);
    }

    public static List<TransactionHistoryResponseDto> mapToResponse(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> new TransactionHistoryResponseDto(
                        transaction.getTransactionType(),
                        transaction.getAmount(),
                        transaction.getTransactionDate(),
                        transaction.getNarration()
                ) {
                })
                .collect(Collectors.toList());
    }

    private static APIResponse setSuccessResponse(Object responseData){
        return new APIResponse<>(ApiResponseCodes.SUCCESS.getCode(),ApiResponseCodes.SUCCESS.getStatus(), responseData);

    }
}
