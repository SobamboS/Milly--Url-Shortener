package com.urlshortener.urlshortener.services;

import com.urlshortener.urlshortener.data.Url;
import com.urlshortener.urlshortener.dto.request.CreateUrlRequest;
import com.urlshortener.urlshortener.dto.response.CreateUrlResponse;

public interface UrlService{
    CreateUrlResponse createUrl(CreateUrlRequest createUrlRequest);

    Url getUrl(String shortenedUrl);
}
