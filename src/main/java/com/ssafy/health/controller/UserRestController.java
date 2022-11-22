package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Login;
import com.ssafy.health.model.dto.User;
import com.ssafy.health.model.service.UserService;
import com.ssafy.health.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserService userService;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/regist")
	public ResponseEntity<String> regist(@RequestBody User user){

		userService.createUser(user);

		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody Login login){

		Map<String, Object> result = new HashMap<>();
		HttpStatus status = null;

		try {
			if (userService.loginUser(login.getId(), login.getPassword())) {
				result.put("access-token", jwtUtil.createToken("id", login.getId()));
				result.put("loginUser", userService.getUser(login.getId()));
				result.put("message", SUCCESS);
			} else {
				result.put("message", FAIL);
			}
			status = HttpStatus.ACCEPTED;
		} catch (UnsupportedEncodingException e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			throw new RuntimeException(e);
		}

		return new ResponseEntity<Map<String, Object>>(result, status);
	}
}
