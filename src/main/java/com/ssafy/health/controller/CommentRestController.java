package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Comment;
import com.ssafy.health.model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentRestController {

	@Autowired
	private CommentService commentService;

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@GetMapping("/{articleId}")
	public ResponseEntity<List<Comment>> list(@PathVariable int articleId){
		List<Comment> list = commentService.getCommentList(articleId);
		return new ResponseEntity<List<Comment>>(list, HttpStatus.OK);
	}

	@PostMapping("/write")
	public ResponseEntity<String> insert(@RequestBody Comment comment){
		commentService.writeComment(comment);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}


	@PutMapping("/update")
	public ResponseEntity<Comment> update(@RequestBody Comment comment){
		commentService.modifyComment(comment);
		return new ResponseEntity<Comment>(comment, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{commentId}")
	public ResponseEntity<String> delete(@PathVariable int commmentId){
		commentService.deleteComment(commmentId);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}
}
