package com.mecash.walletapp.service;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.request.DepositRequestDto;
import com.mecash.walletapp.dto.request.TransferRequestDto;
import com.mecash.walletapp.dto.request.WithdrawRequestDto;
import com.mecash.walletapp.dto.response.AccountBalanceResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WalletService {
    ResponseEntity<APIResponse<String>> processDeposit(DepositRequestDto depositRequestDto);

    ResponseEntity<APIResponse<String>> processTransfer(TransferRequestDto transferRequestDto);

    ResponseEntity<APIResponse<String>> processWithdraw(WithdrawRequestDto withdrawRequestDto);

    ResponseEntity<APIResponse<List<AccountBalanceResponseDto>>> getAccountBalance(Long accountId);
}

