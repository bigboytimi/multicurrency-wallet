package com.mecash.walletapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("meCash Wallet Application")
                .version("1.0")
                .description("The meCash Wallet API documentation for managing wallets, transactions, and user accounts.")
                .termsOfService("http://www.mecash.com/terms")
                .contact(new Contact()
                    .name("meCash Support")
                    .url("http://www.mecash.com/contact")
                    .email("support@mecash.com"))
                .license(new License()
                    .name("MIT License")
                    .url("http://opensource.org/licenses/MIT")));
    }
}
