package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Comment;

import java.util.List;

public interface CommentDao {
    // 댓글 등록
    void insertComment(Comment comment);

    // 댓글 목록 조회
    List<Comment> selectList(int articleId);

    // 댓글 삭제
    int deleteComment(int commentId);

    // 댓글 수정
    int update(Comment comment);

    //댓글 선택
    Comment selectOne(int commentId);
}
