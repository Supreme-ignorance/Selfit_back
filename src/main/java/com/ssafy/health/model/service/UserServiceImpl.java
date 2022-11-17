package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.UserDao;
import com.ssafy.health.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void createUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean loginUser(String id, String password) {
		User user = userDao.selectUserById(id);
		if(user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
