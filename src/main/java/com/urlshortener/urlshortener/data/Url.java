package com.urlshortener.urlshortener.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Url{
    @Id
    private String urlId;
    private String originalUrl;
    private String shortenedUrl;
}
