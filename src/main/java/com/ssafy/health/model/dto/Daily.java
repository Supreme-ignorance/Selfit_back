package com.ssafy.health.model.dto;

import java.util.Date;

public class Daily {
    private int dailySeq;
    private String userId;
    private String date;

    private Type type;
    private int count;

    public Daily() {}

    public Daily(String userId, int count, Type type) {
        this.userId = userId;
        this.count = count;
        this.type = type;
    }

    public int getDailySeq() {
        return dailySeq;
    }

    public void setDailySeq(int dailySeq) {
        this.dailySeq = dailySeq;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "dailySeq=" + dailySeq +
                ", userId='" + userId + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", count=" + count +
                '}';
    }
}

enum Type {홈트, 피트니스, 요가, 필라테스}