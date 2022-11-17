package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.ReviewDao;
import com.ssafy.health.model.dto.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewDao reviewDao;

    @Override
    public List<Review> getReviewList(Map<String, String> params) {
        return reviewDao.selectList(params);
    }

    @Override
    public void writeReview(Review review) {
        reviewDao.insertReview(review);
    }

    @Override
    public int modifyReview(Review review) {
        return reviewDao.updateReview(review);
    }

    @Override
    public Review detailReview(int review_id) {
        return reviewDao.selectOne(review_id);
    }

    @Override
    public int deleteReview(int review_id) {
        return reviewDao.deleteReview(review_id);
    }
}
