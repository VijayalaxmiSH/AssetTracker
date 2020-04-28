package com.lk.assettracker.exception;

public class BadRequestRequestException extends RuntimeException{
    public BadRequestRequestException(String message) {
        super(message);
    }

    public BadRequestRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
