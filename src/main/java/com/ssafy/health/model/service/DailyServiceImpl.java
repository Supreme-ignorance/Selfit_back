package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.DailyDao;
import com.ssafy.health.model.dao.UserDao;
import com.ssafy.health.model.dto.Daily;
import com.ssafy.health.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyServiceImpl implements DailyService {
    @Autowired
    private DailyDao dailyDao;
    @Autowired
    private UserDao userDao;

    @Override
    public List<Daily> getDailyList(String userId) {
        return dailyDao.getRecords(userId);
    }

    @Override
    public void write(Daily daily) {

        User user = userDao.selectUserById(daily.getUserId());

        user.setExp(user.getExp()+daily.getCount());
        while(user.getExp()>=user.getLevel()*100) {
            user.setExp(user.getExp()-user.getLevel()*100);
            user.setLevel(user.getLevel()+1);
        }

        userDao.updateUser(user);

        dailyDao.insert(daily);
    }
}
