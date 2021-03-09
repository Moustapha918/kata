package com.keywer.kata.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {

    private BigDecimal amount;
    private OperationType operationType;
    private LocalDateTime date;


    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
