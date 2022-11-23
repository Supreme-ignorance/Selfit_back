package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Daily;
import com.ssafy.health.model.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/daily")
public class DailyRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private DailyService dailyService;

    @PostMapping("/write")
    public ResponseEntity<String> insert(@RequestBody Daily daily){
        dailyService.write(daily);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }


    @GetMapping("/{userId}")
    public ResponseEntity<List<Daily>> list(@PathVariable String userId){

        List<Daily> list = dailyService.getDailyList(userId);
        return new ResponseEntity<List<Daily>>(list, HttpStatus.OK);
    }

    @GetMapping("/groupType/{userId}")
    public ResponseEntity<List<Daily>> listGroupType(@PathVariable String userId){

        List<Daily> list = dailyService.getDailyListGroupType(userId);
        return new ResponseEntity<List<Daily>>(list, HttpStatus.OK);
    }

}
