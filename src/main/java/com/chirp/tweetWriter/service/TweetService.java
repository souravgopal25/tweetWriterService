package com.chirp.tweetWriter.service;

import com.chirp.tweetWriter.model.Tweet;
import com.chirp.tweetWriter.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
    @Autowired
    TweetRepository tweetRepository;
    public boolean save(Tweet tweet){
        try {
            tweetRepository.save(tweet);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
