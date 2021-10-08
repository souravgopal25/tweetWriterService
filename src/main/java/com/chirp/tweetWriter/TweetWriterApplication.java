package com.chirp.tweetWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class TweetWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetWriterApplication.class, args);
	}

}
