package com.keywer.kata.api;

import com.keywer.kata.services.Account;
import com.keywer.kata.services.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {


    @Autowired
    Account account;

    @PostMapping(path = "/api/deposit", consumes = "application/json", produces = "application/json")
    public Account deposit(@RequestBody Amount amount){
        this.account.deposit(amount.getAmount());

        return account;

    }
}
