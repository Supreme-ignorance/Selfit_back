package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    //리뷰 목록 가져오기
    List<Article> getArticleList(Map<String, String> params);

    //리뷰 작성
    void write(Article article);

    //리뷰 수정
    int modify(Article article);

    //리뷰 상세 페이지
    Article detail(int articleId);

    //리뷰 삭제
    int delete(int articleId);

    void updateViewCnt(int articleId);
}
