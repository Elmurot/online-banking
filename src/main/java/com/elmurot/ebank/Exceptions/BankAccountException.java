package com.elmurot.ebank.Exceptions;

public class BankAccountException extends RuntimeException{
    public BankAccountException(String message){
        super(message);
    }
}
