package com.mecash.walletapp.security;


import com.mecash.walletapp.exceptions.NotFoundException;
import com.mecash.walletapp.model.Customer;
import com.mecash.walletapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer user = userRepository.findByUsername(username);
        if (user == null){
            throw new NotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
