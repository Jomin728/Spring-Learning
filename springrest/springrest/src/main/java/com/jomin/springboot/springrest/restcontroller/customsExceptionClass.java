package com.jomin.springboot.springrest.restcontroller;

public class customsExceptionClass extends RuntimeException {

    public customsExceptionClass() {
    }

    public customsExceptionClass(String message) {
        super(message);
    }

    public customsExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }

    public customsExceptionClass(Throwable cause) {
        super(cause);
    }

    public customsExceptionClass(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
