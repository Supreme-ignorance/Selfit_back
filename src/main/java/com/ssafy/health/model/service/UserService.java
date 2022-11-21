package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
	//회원가입
	void createUser(User user);

	//로그인
	boolean loginUser(String id, String password);
	
	//유저 한명 가져오기
	User getUser(String id);


}
