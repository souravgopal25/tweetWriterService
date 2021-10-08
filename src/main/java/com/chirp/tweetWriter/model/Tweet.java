package com.chirp.tweetWriter.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "tweet_table")
public class Tweet {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
    private int id;
    @Column(unique = true)
    private String tweetId;
    private String uid;
    private String tweetContent;
    private LocalDateTime timeStamp;
    private String lattitude;
    private String longitude;
    private String parentTweetId;

    public Tweet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getParentTweetId() {
        return parentTweetId;
    }

    public void setParentTweetId(String parentTweetId) {
        this.parentTweetId = parentTweetId;
    }
}
