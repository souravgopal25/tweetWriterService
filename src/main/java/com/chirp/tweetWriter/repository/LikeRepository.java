package com.chirp.tweetWriter.repository;

import com.chirp.tweetWriter.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like,Long> {

}
