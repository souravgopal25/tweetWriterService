package com.chirp.tweetWriter.service;

import com.chirp.tweetWriter.model.Retweet;
import org.springframework.beans.factory.annotation.Autowired;

public class RetweetService {
    @Autowired
    RetweetService retweetService;
    public boolean save(Retweet retweet){
        try {
            retweetService.save(retweet);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
