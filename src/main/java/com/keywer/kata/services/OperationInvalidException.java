package com.keywer.kata.services;

public class OperationInvalidException extends RuntimeException {
    public OperationInvalidException(String message) {
        super(message);
    }
}
