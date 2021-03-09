package com.keywer.kata.api;

import com.keywer.kata.services.Account;
import com.keywer.kata.services.Amount;
import com.keywer.kata.services.Operation;
import com.keywer.kata.services.OperationInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class AccountController {


    @Autowired
    Account account;

    @PostMapping(path = "/api/deposit", consumes = "application/json",
            produces = "application/json")
    public void deposit(@RequestBody Amount amount){

        this.account.deposit(amount.getAmount());
    }

    @PostMapping(path = "/api/withdrawal", consumes = "application/json",
            produces = "application/json")
    public void withdrawal(@RequestBody Amount amount){
        try{
            this.account.withdrawal(amount.getAmount());
        } catch (OperationInvalidException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);

        }
    }

    @GetMapping(path = "/api/statment", consumes = "application/json",
            produces = "application/json")
    public Account getStatement(){

        return account;

    }

}
