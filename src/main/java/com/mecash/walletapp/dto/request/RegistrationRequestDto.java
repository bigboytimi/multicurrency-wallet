package com.mecash.walletapp.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


public class RegistrationRequestDto {

    @NotBlank(message = "first name should not be blank")
    private String firstName;

    @NotBlank(message = "last name should not be blank")

    private String lastName;
    @NotBlank(message = "password should not be blank")

    private String password;
    @NotBlank(message = "password should not be blank")
    private String username;
    @NotBlank(message = "password should not be blank")
    private String address;
    @NotBlank(message = "phoneNumber should not be blank")
    private String phoneNumber;
    @NotBlank(message = "email should not be blank")
    private String email;
    @NotBlank(message = "customerType should not be blank")
    @Pattern(
            regexp = "^[CI]$",
            message = "customerType must be either 'C' (Corporate) or 'I' (Individual)"
    )
    private String customerType;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerType() {
        return customerType;
    }

    @Override
    public String toString() {
        return "RegistrationRequestDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
