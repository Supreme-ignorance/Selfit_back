package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.UserDao;
import com.ssafy.health.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

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

	@Override
	public User getUser(String id) {
		return userDao.selectUserById(id);
	}

	@Override
	public boolean getUserByNickname(String nickname) {
		return userDao.selectUserByNickname(nickname);
	}

	@Override
	public void updateUser(User user) {
		User temp = userDao.selectUserById(user.getId());

		temp.setHeight(user.getHeight());
		temp.setWeight(user.getWeight());
		temp.setPassword(user.getPassword());
		temp.setInfoDisclose(user.getInfoDisclose());

		userDao.updateUser(temp);
	}

	@Override
	public int deleteUser(String id) {
		return userDao.deleteUser(id);
	}

}
