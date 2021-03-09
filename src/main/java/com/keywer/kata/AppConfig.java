package com.keywer.kata;

import com.keywer.kata.services.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Account initAccount(){
        Account initialAccount = new Account();
        initialAccount.setBalance(BigDecimal.ZERO);
        initialAccount.setOperations(new ArrayList<>());

        return initialAccount;

    }


}
