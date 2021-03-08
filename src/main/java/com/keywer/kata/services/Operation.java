package com.keywer.kata.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {

    private BigDecimal amount;
    private String operationType;
    private LocalDateTime date;

    public void saveDeposit(BigDecimal amount){


    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
