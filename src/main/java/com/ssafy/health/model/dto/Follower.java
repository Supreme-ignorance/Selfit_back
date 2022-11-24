package com.ssafy.health.model.dto;

public class Follower {
    private int followIndex;
    private String userId;
    private String followerId;
    private String nickname;

    public Follower() {
    }

    public Follower(int followIndex, String userId, String followerId, String nickname) {
        this.followIndex = followIndex;
        this.userId = userId;
        this.followerId = followerId;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getFollowIndex() {
        return followIndex;
    }

    public void setFollowIndex(int followIndex) {
        this.followIndex = followIndex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
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
