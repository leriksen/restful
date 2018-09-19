package com.example.restful.controllers;

import com.example.restful.resources.Article;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/articles",produces = MediaType.APPLICATION_JSON_VALUE)
public class ArticleResource {
    @RequestMapping(path="/index")
    public Article getHello() {
        return new Article("How to test Rest", "Stackoverflow is your friend");
    }
}
