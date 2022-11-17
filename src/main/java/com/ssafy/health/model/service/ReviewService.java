package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Review;

import java.util.List;
import java.util.Map;

public interface ReviewService {
    //리뷰 목록 가져오기
    List<Review> getReviewList(Map<String, String> params);

    //리뷰 작성
    void writeReview(Review review);

    //리뷰 수정
    int modifyReview(Review review);

    //리뷰 상세 페이지
    Review detailReview(int review_id);

    //리뷰 삭제
    int deleteReview(int review_id);
}
