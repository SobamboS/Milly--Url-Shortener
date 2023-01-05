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
        Url newUrl = buildUrl(createUrlRequest);
        Url savedUrl = UrlRepository.save(newUrl);
        CreateUrlResponse createUrlResponse = buildResponse(savedUrl);
        return new CreateUrlResponse(201, newUrl.getShortenedUrl(), "Hello world");


        return null;
    }

    private Url buildUrl(CreateUrlRequest createUrlRequest){
    }

    @Override
    public Url getUrl(String shortenedUrl){
        return null;
    }


}
