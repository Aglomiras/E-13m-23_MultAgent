package org.mpei.HomeWork_4;

public class UnknownCharacterException extends DataException {
    public UnknownCharacterException() {
    }

    public UnknownCharacterException(String message) {
        super(message);
    }

    public UnknownCharacterException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownCharacterException(Throwable cause) {
        super(cause);
    }

    public UnknownCharacterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
