package com.chirp.tweetWriter.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "like_table")
public class Like {
    @Id
    @SequenceGenerator(
            name = "like_sequence",
            sequenceName = "like_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "like_sequence")
    private int id;
    private String tweetId;
    private String uid;
    private LocalDateTime timeStamp;

    public Like() {
    }
}
