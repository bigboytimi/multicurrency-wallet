package com.mecash.walletapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = "com.mecash.walletapp")
@EnableJpaAuditing
@OpenAPIDefinition(info = @Info(title = "Your API", version = "v1"))
public class WalletappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletappApplication.class, args);
    }




}
