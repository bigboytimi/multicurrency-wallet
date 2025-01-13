package com.mecash.walletapp.controller.api;

import com.mecash.walletapp.dto.request.LoginRequestDto;
import com.mecash.walletapp.common.APIResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserControllerApi {
    ResponseEntity<APIResponse<String>> authentication(@RequestBody @Valid LoginRequestDto loginRequestDto);
}
