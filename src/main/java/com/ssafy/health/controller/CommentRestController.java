package com.ssafy.health.controller;

import com.ssafy.health.model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Comment")
public class CommentRestController {

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@GetMapping("/board")
	public ResponseEntity<String> list(){

		return new ResponseEntity<String>("안녕", HttpStatus.OK);
	}
}
