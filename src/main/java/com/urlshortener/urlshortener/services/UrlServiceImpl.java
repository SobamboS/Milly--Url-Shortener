package com.urlshortener.urlshortener.services;

import com.google.common.hash.Hashing;
import com.urlshortener.urlshortener.data.Url;
import com.urlshortener.urlshortener.data.UrlRepository;
import com.urlshortener.urlshortener.dto.request.CreateUrlRequest;
import com.urlshortener.urlshortener.dto.response.CreateUrlResponse;
import com.urlshortener.urlshortener.exception.InvalidUrlException;
import com.urlshortener.urlshortener.validator.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;


@Service
public class UrlServiceImpl implements UrlService{
    @Autowired
    private UrlRepository urlRepository;


    @Override
    public CreateUrlResponse createUrl(CreateUrlRequest createUrlRequest){
        Url newUrl = buildUrl(createUrlRequest);
        Url savedUrl = urlRepository.save(newUrl);
        return new CreateUrlResponse(201, newUrl.getShortenedUrl(), "Created", newUrl.getOriginalUrl());

    }

    private Url buildUrl(CreateUrlRequest createUrlRequest){
        Url url = new Url();
        if(UrlValidator.urlIsValid(createUrlRequest.getOriginalUrl())){
        throw new InvalidUrlException(String.format("Url %s is invalid", createUrlRequest.getOriginalUrl()));
        }
        String hashedUrl =getShortenedUrl(createUrlRequest);
        url.setOriginalUrl(createUrlRequest.getOriginalUrl());
        url.setShortenedUrl(hashedUrl);
            return url;
    }

    private String getShortenedUrl(CreateUrlRequest createUrlRequest){
        return Hashing.murmur3_32().
                hashString(createUrlRequest.getOriginalUrl(),StandardCharsets.UTF_8)
                .toString();
    }

    @Override
    public Url getUrl(String shortenedUrl){
        return urlRepository.findShortenedUrlByShortenedUrl(shortenedUrl);
    }


}
