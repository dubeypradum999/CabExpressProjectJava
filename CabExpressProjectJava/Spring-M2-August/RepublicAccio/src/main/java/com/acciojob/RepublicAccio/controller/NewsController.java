package com.acciojob.RepublicAccio.controller;

import com.acciojob.RepublicAccio.Response.NewsResponse;
import com.acciojob.RepublicAccio.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public NewsResponse getNews(@RequestParam("countryCode") String countryCode,
                                @RequestParam("apiKey") String apiKey) {
        return newsService.getNews(countryCode,apiKey);
    }
}
