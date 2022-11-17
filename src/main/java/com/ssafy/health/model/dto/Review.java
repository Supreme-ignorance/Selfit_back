package com.ssafy.health.model.dto;

import java.util.Date;

public class Review {
    private int reviewId;
    private String videoId;
    private String writer;
    private String title;
    private String content;
    private String regDate;
    private int viewCnt;

    public Review() {
    }

    public Review(int reviewId, String videoId, String writer, String title, String content, String regDate, int viewCnt) {
        this.reviewId = reviewId;
        this.videoId = videoId;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
        this.viewCnt = viewCnt;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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
        return "Review{" +
                "reviewId=" + reviewId +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", reg_date=" + regDate +
                ", viewCnt=" + viewCnt +
                '}';
    }
}
