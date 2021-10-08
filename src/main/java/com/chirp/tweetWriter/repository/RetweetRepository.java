package com.chirp.tweetWriter.repository;

import com.chirp.tweetWriter.model.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetweetRepository extends JpaRepository<Retweet,Long> {
}
