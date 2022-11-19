package com.ssafy.health.model.dto;


public class Video {
    private String videoId;
    private String title;
    private String channelName;
    private String videoType;
    private int viewCnt;
    private int likeCnt;

    public Video() {
    }

    public Video(String videoId, String title, String channelName, String videoType, int viewCnt, int likeCnt) {
        this.videoId = videoId;
        this.title = title;
        this.channelName = channelName;
        this.videoType = videoType;
        this.viewCnt = viewCnt;
        this.likeCnt = likeCnt;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId='" + videoId + '\'' +
                ", title='" + title + '\'' +
                ", channelName='" + channelName + '\'' +
                ", videoType='" + videoType + '\'' +
                ", viewCnt=" + viewCnt +
                ", likeCnt=" + likeCnt +
                '}';
    }
}
