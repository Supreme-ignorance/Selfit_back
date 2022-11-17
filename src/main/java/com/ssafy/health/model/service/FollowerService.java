package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.User;

import java.util.List;

public interface FollowerService {
    //팔로워 목록 가져오기
    List<User> getFollowerList(String userId);

    //팔로우
    void followUser(String userId);

    //언팔로우
    void unfollowUser(String userId);
}
