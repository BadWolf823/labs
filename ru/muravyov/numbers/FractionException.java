package ru.muravyov.numbers;

public class FractionException extends RuntimeException{
    public FractionException(){
        super();
    }
    public FractionException(String mes){
        super(mes);
    }

    public FractionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FractionException(Throwable cause) {
        super(cause);
    }

    public FractionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
