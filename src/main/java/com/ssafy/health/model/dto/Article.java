package com.ssafy.health.model.dto;

public class Article {
    private int articleId;
    private int boardSeq;
    private String writer;
    private String title;
    private String content;
    private String regDate;
    private int viewCnt;

    public Article() {
    }

    public Article(int boardSeq, String writer, String title, String content, String regDate, int viewCnt) {
        this.boardSeq = boardSeq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
        this.viewCnt = viewCnt;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getBoardSeq() {
        return boardSeq;
    }

    public void setBoardSeq(int reviewId) {
        this.boardSeq = reviewId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", boardSeq=" + boardSeq +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", regDate='" + regDate + '\'' +
                ", viewCnt=" + viewCnt +
                '}';
    }
}
