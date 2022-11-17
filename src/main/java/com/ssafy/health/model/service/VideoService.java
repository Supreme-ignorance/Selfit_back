package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Video;

import java.util.List;
import java.util.Map;

public interface VideoService {
    //비디오 목록 가져오기
    List<Video> getVideoList(Map<String, String> params);

    //비디오 선택
    Video getVideo(String videoId);

    // 좋아하는 비디오 목록 가져오기
    List<Video> getLikedVideoList(String id);

    // 좋아하는 비디오 확인
    boolean getLikedVideoList(Map<String, String> params);

    // 비디오 찜하기
    void likeVideo(Map<String, String> params);

    // 비디오 찜 해제하기
    void unlikeVideo(Map<String, String> params);

    void upViewCnt(String videoId);
}
