package com.guyot.blog.exception;

/**
 * Common exception to be extended by other business exceptions
 * or used directly by programmers.
 */
public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }


    public ServiceException(Throwable cause) {
        super(cause);
    }


    protected ServiceException(String message, Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
