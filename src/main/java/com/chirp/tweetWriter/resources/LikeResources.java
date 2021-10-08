package com.chirp.tweetWriter.resources;

import com.chirp.tweetWriter.model.Like;
import com.chirp.tweetWriter.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LikeResources {
    @Autowired
    LikeService likeService;

    @RequestMapping(value = "/v1/like",method = RequestMethod.POST)
    public ResponseEntity<?> like(@RequestBody Like like)throws Exception{
        boolean check;
        Map<String,Object> map=new HashMap<>();
        try {
            likeService.save(like);
        }catch (Exception e){
            map.put("status code", 403);
            map.put("message","uploaded succesfully");
            ResponseEntity response=new ResponseEntity(map, HttpStatus.valueOf(403));
            return response;
        }
        map.put("status code",201);
        map.put("message","uploaded succesfully");
        ResponseEntity response=new ResponseEntity(map, HttpStatus.valueOf(403));
        return response;
    }
}
