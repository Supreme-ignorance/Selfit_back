package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Comment;

import java.util.List;
import java.util.Map;

public interface CommentService {
    //댓글 목록 가져오기
    List<Comment> getCommentList(int articleId);

    //댓글 작성
    void writeComment(Comment comment);

    //댓글 삭제
    void deleteComment(int commentId);

    //댓글 수정
    void modifyComment(Comment comment);

}
