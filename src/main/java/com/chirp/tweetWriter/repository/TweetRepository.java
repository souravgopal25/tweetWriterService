package com.chirp.tweetWriter.repository;

import com.chirp.tweetWriter.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet,Long> {

}
