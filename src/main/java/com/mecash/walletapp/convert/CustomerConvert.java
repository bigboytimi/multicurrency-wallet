package com.mecash.walletapp.convert;

import com.mecash.walletapp.dto.request.RegistrationRequestDto;
import com.mecash.walletapp.model.Customer;
import com.mecash.walletapp.model.CustomerType;

public class CustomerConvert {


    public static Customer convertDtoToCustomer(RegistrationRequestDto requestDto) {
        Customer customer = new Customer();
        customer.setAddress(requestDto.getAddress());
        customer.setEmail(requestDto.getEmail());
        customer.setCustomerType(requestDto.getCustomerType().equals("C") ? CustomerType.CORPORATE : CustomerType.INDIVIDUAL);
        customer.setFirstName(requestDto.getFirstName());
        customer.setLastName(requestDto.getLastName());
        customer.setPhoneNumber(requestDto.getPhoneNumber());
        customer.setUsername(requestDto.getUsername());
        return customer;
    }
}
