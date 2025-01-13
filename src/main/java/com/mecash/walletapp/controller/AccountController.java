package com.mecash.walletapp.controller;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.controller.api.AccountControllerApi;
import com.mecash.walletapp.dto.response.TransactionHistoryResponseDto;
import com.mecash.walletapp.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@Tag(name = "Account Management", description = "Endpoints for managing accounts and transactions")
public class AccountController implements AccountControllerApi {


    private final AccountService accountService;

    @Autowired

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @Override
    @GetMapping(value = "/transaction-history", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Get Transaction History",
            description = "Fetch the transaction history for a specific account by its ID",
            parameters = @Parameter(name = "accountId",
                    description = "The ID of the account whose transaction history is to be retrieved",
                    required = true,
                    example = "12345"
            )
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "00", description = "Operation Successful."),
            @ApiResponse(responseCode = "01", description = "Operation Failed.")})
    public ResponseEntity<APIResponse<List<TransactionHistoryResponseDto>>> getTransactionHistory(@RequestParam Long accountId) {
        return accountService.getTransactionHistory(accountId);
    }
}
