package com.keywer.kata.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {



    @Test
    void should_add_deposit_amount() {
        BigDecimal amount = BigDecimal.valueOf(45.54);

        Account account = new Account();
        account.setOperations(new ArrayList<>());
        account.setBalance(BigDecimal.ZERO);

        account.deposit(amount);

        assertEquals( 45.54, account.balance.doubleValue(), " shoud add amount to existing balance");
    }

    @Test
    void shoud_substruct_retreived_amount() {

        BigDecimal amount = BigDecimal.valueOf(100);

        Account account = new Account();
        account.setBalance(BigDecimal.valueOf(2000.00));
        account.setOperations(new ArrayList<>());

        account.withdrawal(amount);

        assertEquals( 1900, account.balance.doubleValue(), " shoud add amount to existing balance");

    }

    @Test
    void should_not_retreive_non_availible_amount(){
        BigDecimal amount = BigDecimal.valueOf(2500);

        Account account = new Account();
        account.setBalance(BigDecimal.valueOf(2000.00));
        account.setOperations(new ArrayList<>());


        Assertions.assertThrows( OperationInvalidException.class,
                () -> account.withdrawal(amount) );

    }

    @Test
    void saveOperation() {


    }


}
