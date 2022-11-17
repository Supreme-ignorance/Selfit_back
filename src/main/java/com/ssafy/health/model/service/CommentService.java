package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Comment;

import java.util.List;
import java.util.Map;

public interface CommentService {
    //댓글 목록 가져오기
    List<Comment> getCommentList(Map<String, String> params);

    //댓글 작성
    void writeComment(Comment comment);


    //댓글 삭제
    void deleteComment(int comment_id);
}
