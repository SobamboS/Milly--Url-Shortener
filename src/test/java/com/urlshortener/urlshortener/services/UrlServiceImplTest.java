package com.urlshortener.urlshortener.services;

import com.urlshortener.urlshortener.dto.request.CreateUrlRequest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UrlServiceImplTest{
    @Autowired
    private UrlService urlService;
    private CreateUrlRequest createUrlRequest;

    @BeforeEach
    void setUp( ){
createUrlRequest = new CreateUrlRequest();
createUrlRequest.setOriginalUrl("https://codereview.stackexchange.com/questions/84812/" +
        "java-class-that-generates-a-short-url-string-for-an-input-string");
    }
}