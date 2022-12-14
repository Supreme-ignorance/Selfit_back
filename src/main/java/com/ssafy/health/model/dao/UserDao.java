package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.User;

import java.util.Map;


public interface UserDao {
    // 유저 등록
    void insertUser(User user);

    // 유저 조회
    User selectUserById(String id);

    boolean selectUserByNickname(String nickname);

    // 유저 삭제
    int deleteUser(String id);

    // 유저 수정
    int updateUser(User user);

}
