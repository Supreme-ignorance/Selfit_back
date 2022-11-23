package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.FollowerDao;
import com.ssafy.health.model.dto.Follower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowerServiceImpl implements FollowerService {

    @Autowired
    private FollowerDao followerDao;

    @Override
    public List<Follower> getFollowerList(String userId) {
        return followerDao.selectList(userId);
    }

    @Override
    public List<Follower> getFollowingList(String followerId) {
        return followerDao.selectFollowingList(followerId);
    }


    @Override
    public void followUser(Follower follower) {
        followerDao.insertUser(follower);
    }

    @Override
    public void unfollowUser(String userId) {
        followerDao.deleteUser(userId);
    }
}
