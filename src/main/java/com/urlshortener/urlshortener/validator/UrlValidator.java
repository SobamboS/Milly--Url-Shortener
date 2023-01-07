package com.urlshortener.urlshortener.validator;

public class UrlValidator{
    public static boolean urlIsValid(String originalUrl){
        return !originalUrl.startsWith("https") || !originalUrl.startsWith("http")
                ||originalUrl.contains(" ") || originalUrl.length() ==0;

    }

}
