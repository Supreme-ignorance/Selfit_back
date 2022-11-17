package com.ssafy.health.model.dto;

public class Follower {
    private int followIndex;
    private int userId;
    private int followerId;

    public Follower(int followIndex, int userId, int followerId) {
        this.followIndex = followIndex;
        this.userId = userId;
        this.followerId = followerId;
    }

    public int getFollowIndex() {
        return followIndex;
    }

    public void setFollowIndex(int followIndex) {
        this.followIndex = followIndex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "followIndex=" + followIndex +
                ", userId=" + userId +
                ", followerId=" + followerId +
                '}';
    }
}
