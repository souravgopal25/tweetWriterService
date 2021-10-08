package com.chirp.tweetWriter.resources;

import com.chirp.tweetWriter.model.Tweet;
import com.chirp.tweetWriter.service.TweetService;
import com.chirp.tweetWriter.utilService.TweetIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TweetResources {
    @Autowired
    private TweetIdGenerator tweetIdGenerator;
    @Autowired
    private TweetService tweetService;
    @GetMapping("/")
    public String home(){
        return "<H1>Hello World<H1>";
    }

    @RequestMapping(value = "/v1/upload",method = RequestMethod.POST)
    public ResponseEntity<?> uploadTweet(@RequestBody Tweet tweet) throws Exception{
        String tweetId=tweetIdGenerator.getTweetId(tweet);
        tweet.setTweetId(tweetId);
        boolean check=tweetService.save(tweet);
        Map<String,Object> map=new HashMap<>();
        int value=0;
        if (check){
            value=201;
            map.put("status code",201);
            map.put("message","uploaded succesfully");

        }else {
            value=403;
            map.put("status code", 403);
            map.put("message","uploaded succesfully");
        }
        ResponseEntity response=new ResponseEntity(map,HttpStatus.valueOf(value));
        return response;
    }
    @RequestMapping(value = "/v1/comment",method = RequestMethod.POST)
    public ResponseEntity<?> uploadComment(@RequestBody Tweet tweet) throws Exception{
        String tweetId=tweetIdGenerator.getTweetId(tweet);
        tweet.setTweetId(tweetId);
        boolean check=tweetService.save(tweet);
        Map<String,Object> map=new HashMap<>();
        int value=0;
        if (check){
            value=201;
            map.put("status code",201);
            map.put("message","uploaded succesfully");

        }else {
            value=403;
            map.put("status code", 403);
            map.put("message","uploaded succesfully");
        }
        ResponseEntity response=new ResponseEntity(map,HttpStatus.valueOf(value));
        return response;
    }



}
