package com.urlshortener.urlshortener.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUrlResponse{
    private int statusCode;
    private String shortenedUrl;
    private String message;
}
