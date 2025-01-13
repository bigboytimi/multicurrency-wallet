package com.mecash.walletapp.service;

import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.request.LoginRequestDto;
import com.mecash.walletapp.dto.request.RegistrationRequestDto;
import com.mecash.walletapp.dto.response.RegistrationResponseDto;
import com.mecash.walletapp.model.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<APIResponse<String>> authenticateAndReturnToken(LoginRequestDto loginRequestDto);

    ResponseEntity<APIResponse<RegistrationResponseDto>> register(RegistrationRequestDto registrationRequestDto);

    Customer getCustomerById(Long accountId);
}
