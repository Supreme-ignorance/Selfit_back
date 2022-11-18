package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.BoardDao;
import com.ssafy.health.model.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDao boardDao;

    @Override
    public List<Board> getBoardList() {
        return boardDao.selectList();
    }
}
