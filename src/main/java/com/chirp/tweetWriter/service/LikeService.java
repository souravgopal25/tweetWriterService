package com.chirp.tweetWriter.service;

import com.chirp.tweetWriter.model.Like;
import com.chirp.tweetWriter.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;

    public boolean save(Like like) {
        try {
            likeRepository.save(like);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public boolean delete(Like like) {
        try {
            likeRepository.delete(like);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
