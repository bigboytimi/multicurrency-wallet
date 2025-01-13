package com.mecash.walletapp.controller.api;

import com.mecash.walletapp.dto.request.DepositRequestDto;
import com.mecash.walletapp.dto.request.TransferRequestDto;
import com.mecash.walletapp.dto.request.WithdrawRequestDto;
import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.response.AccountBalanceResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface WalletControllerApi {
    ResponseEntity<APIResponse<String>> deposit(@RequestBody @Valid DepositRequestDto depositRequestDto);

    ResponseEntity<APIResponse<String>> transfer(@RequestBody @Valid TransferRequestDto transferRequestDto);

    ResponseEntity<APIResponse<String>> withdraw(@RequestBody @Valid WithdrawRequestDto withdrawRequestDto);

    ResponseEntity<APIResponse<List<AccountBalanceResponseDto>>> getAccountBalance(@RequestParam Long accountId);
}
