package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Article;
import com.ssafy.health.model.dto.Board;
import com.ssafy.health.model.service.ArticleService;
import com.ssafy.health.model.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/board")
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public ResponseEntity<List<Board>> list(){
        List<Board> list = boardService.getBoardList();
        return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
    }

    @GetMapping("/{boardSeq}")
    public ResponseEntity<Board> detail(@PathVariable int boardSeq){
        Board board = boardService.getBoardList().get(boardSeq);
        return new ResponseEntity<Board>(board, HttpStatus.OK);
    }
}
