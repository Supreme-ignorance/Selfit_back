package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.User;
import com.ssafy.health.model.dto.Video;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VideoDao {
    // 영상 목록
    List<Video> selectList(Map<String, String> params);

    // 영상 선택
    Video selectVideoById(String videoId);

    // 찜한 영상 가져오기
    List<Video> selectLikedVideoList(String id);

    // 뷰카운트 올리기
    void updateViewCount(String videoId);

    // 좋아요카운트 올리기
    void updateLikeCount(String videoId);

    // 좋아요카운트 내리기
    void subtractLikeCount(String videoId);

    // 찜하기
    void insertLikedVideo(Map<String, String> params);

    // 찜 삭제
    void deleteLikedVideo(Map<String, String> params);

    Video selectLikedVideo(Map<String, String> params);
}
