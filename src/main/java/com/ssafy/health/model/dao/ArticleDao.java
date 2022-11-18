package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Article;

import java.util.List;
import java.util.Map;

public interface ArticleDao {
    // 리뷰 등록
    void insert(Article article);

    // 리뷰 목록
    List<Article> selectList(Map<String, String> params);

    // 리뷰 조회
    Article selectOne(int reviewId);
    
    // 리뷰 삭제
    int delete(int reviewId);

    // 리뷰 수정
    int update(Article article);
}
