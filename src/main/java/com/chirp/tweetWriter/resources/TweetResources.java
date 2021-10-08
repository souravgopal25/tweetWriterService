package com.chirp.tweetWriter.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetResources {
    @RequestMapping("/")
    public String home(){
        return "<H1>Hello World<H1>";
    }

}
