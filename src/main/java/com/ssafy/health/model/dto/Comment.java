package com.ssafy.health.model.dto;

import java.util.Date;

public class Comment {
    private int commentId;
    private int articleId;
    private String writer;
    private String writerNickname;
    private String content;
    private int left;
    private int right;
    private String regDate;

    public Comment() {
    }

    public Comment(int commentId, int articleId, String writer, String writerNickname, String content, int left, int right, String regDate) {
        this.commentId = commentId;
        this.articleId = articleId;
        this.writer = writer;
        this.writerNickname = writerNickname;
        this.content = content;
        this.left = left;
        this.right = right;
        this.regDate = regDate;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriterNickname() {
        return writerNickname;
    }

    public void setWriterNickname(String writerNickname) {
        this.writerNickname = writerNickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + articleId +
                ", writer='" + writer + '\'' +
                ", writerNickname='" + writerNickname + '\'' +
                ", content='" + content + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
