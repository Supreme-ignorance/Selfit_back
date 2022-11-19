package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Article;
import com.ssafy.health.model.dto.Comment;
import com.ssafy.health.model.service.ArticleService;
import com.ssafy.health.model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Comment")
public class CommentRestController {

	@Autowired
	private CommentService commentService;

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@GetMapping("/write")
	public ResponseEntity<String> list(){
		return new ResponseEntity<String>("안녕", HttpStatus.OK);
	}

	@PostMapping("/write")
	public ResponseEntity<String> insert(@RequestBody Comment comment){
		commentService.writeComment(comment);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

}
