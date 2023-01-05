package com.urlshortener.urlshortener.controller;

import com.urlshortener.urlshortener.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController{

    @Autowired
    private UrlService urlService;


}
