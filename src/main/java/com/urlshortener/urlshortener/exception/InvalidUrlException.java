package com.urlshortener.urlshortener.exception;

public class InvalidUrlException extends RuntimeException{
    public  InvalidUrlException(String message){
        super(message);
    }
}
