package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.DailyDao;
import com.ssafy.health.model.dto.Daily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyServiceImpl implements DailyService {
    @Autowired
    private DailyDao dailyDao;


    @Override
    public List<Daily> getDailyList(String userId) {
        return dailyDao.getRecords(userId);
    }

    @Override
    public void write(Daily daily) {
        dailyDao.insert(daily);
    }
}
