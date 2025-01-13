package com.mecash.walletapp.controller.api;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.response.TransactionHistoryResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AccountControllerApi {

    ResponseEntity<APIResponse<List<TransactionHistoryResponseDto>>> getTransactionHistory(@RequestParam Long accountId);
}
