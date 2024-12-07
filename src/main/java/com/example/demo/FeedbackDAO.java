package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedbackDAO {

	@Autowired
	FeedbackInterface repo;

	public void insert(Feedback feed) {
		repo.save(feed);
		
	}
	
	
}
