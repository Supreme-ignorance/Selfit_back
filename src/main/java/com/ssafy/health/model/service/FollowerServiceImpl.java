package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.FollowerDao;
import com.ssafy.health.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FollowerServiceImpl implements FollowerService {

    @Autowired
    private FollowerDao followerDao;

    @Override
    public List<User> getFollowerList(String userId) {
        return followerDao.selectList(userId);
    }

    @Override
    public void followUser(String userId) {
        followerDao.selectUser(userId);
    }

    @Override
    public void unfollowUser(String userId) {
        followerDao.deleteUser(userId);
    }
}
