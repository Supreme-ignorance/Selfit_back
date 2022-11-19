package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Follower;
import com.ssafy.health.model.dto.User;

import java.util.List;

public interface FollowerDao {

    // 팔로우 중인 목록
    List<Follower> selectList(String userId);

    // 팔로우
    void insertUser(Follower follower);

    // 언팔로우용
    void deleteUser(String userId);


}
