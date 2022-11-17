package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Review;

import java.util.List;
import java.util.Map;

public interface ReviewDao {
    // 리뷰 등록
    void insertReview(Review review);

    // 리뷰 목록
    List<Review> selectList(Map<String, String> params);

    // 리뷰 조회
    Review selectOne(int reviewId);
    
    // 리뷰 삭제
    int deleteReview(int reviewId);

    // 리뷰 수정
    int updateReview(Review review);
}
