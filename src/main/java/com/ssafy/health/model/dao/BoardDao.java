package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Board;

import java.util.List;

public interface BoardDao {

    // 게시판 목록
    List<Board> selectList();

    // 리뷰 조회
    Board selectOne(int boardSeq);


}
