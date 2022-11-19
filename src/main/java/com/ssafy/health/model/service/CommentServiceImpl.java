package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.CommentDao;
import com.ssafy.health.model.dto.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;


    @Override
    public List<Comment> getCommentList(int articleId) {
        commentDao.selectList(articleId);
        return null;
    }

    @Override
    public void writeComment(Comment comment) {
        commentDao.insertComment(comment);
    }

    @Override
    public void deleteComment(int comment_id) {
        commentDao.deleteComment(comment_id);
    }

    @Override
    public void modifyComment(Comment comment) {
        commentDao.update(comment);
    }
}
