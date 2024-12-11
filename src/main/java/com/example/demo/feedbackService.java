package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class feedbackService {

	@Autowired
	FeedbackDAO dao;
	
	@PostMapping("/addfeedback")
	public String insertfeed(@RequestBody Feedback feed) {
		dao.insert(feed);
		return "feedback submitted!";
	}
	
}
