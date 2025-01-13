package com.mecash.walletapp.controller;


import com.mecash.walletapp.controller.api.UserControllerApi;
import com.mecash.walletapp.common.APIResponse;
import com.mecash.walletapp.dto.request.LoginRequestDto;
import com.mecash.walletapp.dto.request.RegistrationRequestDto;
import com.mecash.walletapp.dto.response.RegistrationResponseDto;
import com.mecash.walletapp.model.Customer;
import com.mecash.walletapp.security.JwtRequestFilter;
import com.mecash.walletapp.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1/users")
@RestController
@Tag(name = "User Management", description = "User authentication and registration APIs")
public class UserController implements UserControllerApi {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private final CustomerService customerService;


    @Autowired
    public UserController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Authenticate User",
            description = "Authenticates a user by their credentials and returns a token if successful.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "00", description = "Operation Successful."),
            @ApiResponse(responseCode = "01", description = "Operation Failed.")})
    public ResponseEntity<APIResponse<String>> authentication(@RequestBody @Valid LoginRequestDto loginRequestDto) {
        return customerService.authenticateAndReturnToken(loginRequestDto);
    }

    @PostMapping(value = "/register" , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Register User",
            description = "Registers a new user and returns the registration details upon success.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "00", description = "Operation Successful."),
            @ApiResponse(responseCode = "01", description = "Operation Failed.")})
    public ResponseEntity<APIResponse<RegistrationResponseDto>> registration(@RequestBody @Valid RegistrationRequestDto registrationRequestDto) {
        log.info("Request Params: {}", registrationRequestDto);
        return customerService.register(registrationRequestDto);
    }
}

