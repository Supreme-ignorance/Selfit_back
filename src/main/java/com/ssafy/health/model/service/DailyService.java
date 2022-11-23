package com.ssafy.health.model.service;

import com.ssafy.health.model.dto.Daily;

import java.util.List;
import java.util.Map;

public interface DailyService {
    //운동기록 목록 가져오기
    List<Daily> getDailyList(String userId);

    //기록 작성
    void write(Daily daily);


    //운동기록 목록 가져오기
    List<Daily> getDailyListGroupType(String userId);
}
