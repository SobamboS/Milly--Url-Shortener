package com.urlshortener.urlshortener.controller;

import com.urlshortener.urlshortener.dto.request.CreateUrlRequest;
import com.urlshortener.urlshortener.dto.response.CreateUrlResponse;
import com.urlshortener.urlshortener.services.UrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins="*")
public class UrlController{

    @Autowired
    private UrlService urlService;
@PostMapping("/post_url")
    public CreateUrlResponse createUrl(@RequestBody CreateUrlRequest createUrlRequest){
    return urlService.createUrl(createUrlRequest);
}
@GetMapping("/url/{shortenedUrl}")
    public void getOriginalUrl(@PathVariable String shortenedUrl,HttpServletResponse response)throws IOException{
    response.sendRedirect(urlService.getUrl(shortenedUrl).getOriginalUrl());
}
}
