package com.ssafy.health.model.dto;

import java.util.Date;

public class Daily {
    private int dailySeq;
    private String userId;
    private Date exDate;
    private int exTime;

    public Daily() {}

    public Daily(String userId, Date exDate, int exTime) {
        this.userId = userId;
        this.exDate = exDate;
        this.exTime = exTime;
    }

    public int getDaily_seq() {
        return dailySeq;
    }

    public void setDaily_seq(int dailySeq) {
        this.dailySeq = dailySeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getExDate() {
        return exDate;
    }

    public void setExDate(Date exDate) {
        this.exDate = exDate;
    }

    public int getExTime() {
        return exTime;
    }

    public void setExTime(int exTime) {
        this.exTime = exTime;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "daily_seq=" + dailySeq +
                ", userId='" + userId + '\'' +
                ", exDate=" + exDate +
                ", exTime=" + exTime +
                '}';
    }
}