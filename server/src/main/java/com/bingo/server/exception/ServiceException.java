package com.bingo.server.exception;

public class ServiceException extends RuntimeException {
    private final int code;

    public ServiceException(int code, String msg) {
        super(msg);
        this.code = code;
    }

}
