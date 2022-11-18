package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Article;

import java.util.List;
import java.util.Map;

public interface ArticleDao {
    // 게시글 등록
    void insert(Article article);

    // 게시글 목록
    List<Article> selectList(Map<String, String> params);

    // 게시글 조회
    Article selectOne(int articleId);
    
    // 게시글 삭제
    int delete(int articleId);

    // 게시글 수정
    int update(Article article);
}
