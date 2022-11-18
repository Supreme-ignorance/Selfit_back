package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    //리뷰 목록 가져오기
    List<Article> getReviewList(Map<String, String> params);

    //리뷰 작성
    void writeReview(Article article);

    //리뷰 수정
    int modifyReview(Article article);

    //리뷰 상세 페이지
    Article detailReview(int review_id);

    //리뷰 삭제
    int deleteReview(int review_id);
}
