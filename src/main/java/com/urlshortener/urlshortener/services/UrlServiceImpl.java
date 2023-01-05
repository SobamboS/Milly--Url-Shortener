package com.urlshortener.urlshortener.services;

import com.urlshortener.urlshortener.data.Url;
import com.urlshortener.urlshortener.data.UrlRepository;
import com.urlshortener.urlshortener.dto.request.CreateUrlRequest;
import com.urlshortener.urlshortener.dto.response.CreateUrlResponse;
import com.urlshortener.urlshortener.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl implements UrlService{
    @Autowired
    private UrlRepository urlRepository;


    @Override
    public CreateUrlResponse createUrl(CreateUrlRequest createUrlRequest){

        return null;
    }

    @Override
    public Url getUrl(String shortenedUrl){
        return null;
    }


}
