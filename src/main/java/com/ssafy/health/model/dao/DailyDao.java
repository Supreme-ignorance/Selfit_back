package com.ssafy.health.model.dao;

import com.ssafy.health.model.dto.Daily;

import java.util.List;
import java.util.Map;

public interface DailyDao {
    // 운동기록 등록
    void insert(Daily daily);

    // 운동기록 목록
    List<Daily> getRecords(String userId);
}
