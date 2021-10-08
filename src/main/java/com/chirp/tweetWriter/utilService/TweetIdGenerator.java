package com.chirp.tweetWriter.utilService;

import com.chirp.tweetWriter.model.Tweet;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Service
public class TweetIdGenerator {
    private String tweetId;

    public String getTweetId(Tweet tweet) {
        String str=tweet.getTweetContent()+tweet.getUid()+tweet.getTimeStamp();
        UUID uuid=UUID.nameUUIDFromBytes(str.getBytes(StandardCharsets.UTF_8));
        tweetId=uuid.toString();
        return tweetId;
    }
}
