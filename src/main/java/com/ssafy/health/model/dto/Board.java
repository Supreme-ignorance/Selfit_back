package com.ssafy.health.model.dto;

public class Board {
    private int boardSeq;
    private String boardName;
    private String boardDetail;

    public Board() {

    }

    public Board(String boardName, String boardDetail) {
        this.boardName = boardName;
        this.boardDetail = boardDetail;
    }

    public int getBoardSeq() {
        return boardSeq;
    }

    public void setBoardSeq(int boardSeq) {
        this.boardSeq = boardSeq;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDetail() {
        return boardDetail;
    }

    public void setBoardDetail(String boardDetail) {
        this.boardDetail = boardDetail;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardSeq=" + boardSeq +
                ", boardName='" + boardName + '\'' +
                ", boardDetail='" + boardDetail + '\'' +
                '}';
    }
}
