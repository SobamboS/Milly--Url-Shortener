package com.urlshortener.urlshortener.data;

import com.urlshortener.urlshortener.data.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String>{
    Url findShortenedUrlByShortenedUrl(String url);
}
