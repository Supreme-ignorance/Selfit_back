package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Follower;

import java.util.List;

public interface FollowerService {
    //팔로워 목록 가져오기
    List<Follower> getFollowerList(String userId);

    //팔로잉 목록 가져오기
    List<Follower> getFollowingList(String followerId);

    //팔로우
    void followUser(Follower follower);

    //언팔로우
    void unfollowUser(Follower follower);

    boolean checkStatus(Follower follower);
}
