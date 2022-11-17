package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Follower;
import com.ssafy.health.model.dto.User;

import java.util.List;

public interface FollowerDao {

    // 팔로우 중인 목록
    List<User> selectList(String userId);

    // 팔로우
    Follower selectUser(String userId);

    // 언팔로우용
    void deleteUser(String userId);


}
