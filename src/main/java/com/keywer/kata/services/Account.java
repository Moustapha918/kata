package com.keywer.kata.services;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


public class Account {

    BigDecimal balance;

    List<Operation> operations;


    public Account() {
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    synchronized public BigDecimal deposit(BigDecimal amount){
        balance = balance.add(amount);
        saveOperation(amount, OperationType.DEPOSIT);
        return balance;
    }

    synchronized public BigDecimal withdrawal(BigDecimal amount) throws OperationInvalidException {
        if( amount.doubleValue() > balance.doubleValue())
            throw new OperationInvalidException("Withdraw Problem");

        balance = balance.subtract(amount);
        saveOperation(amount, OperationType.WITHDRAWAL);

        return balance;
    }


    public void saveOperation(BigDecimal amount, OperationType operationType){
        Operation operation = new Operation();
        operation.setAmount(amount);
        operation.setOperationType(operationType);
        operation.setDate(LocalDateTime.now());
        operations.add(operation);
    }

}
