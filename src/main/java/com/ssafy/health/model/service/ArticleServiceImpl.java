package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.ArticleDao;
import com.ssafy.health.model.dto.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> getReviewList(Map<String, String> params) {
        return articleDao.selectList(params);
    }

    @Override
    public void writeReview(Article article) {
        articleDao.insert(article);
    }

    @Override
    public int modifyReview(Article article) {
        return articleDao.update(article);
    }

    @Override
    public Article detailReview(int review_id) {
        return articleDao.selectOne(review_id);
    }

    @Override
    public int deleteReview(int review_id) {
        return articleDao.delete(review_id);
    }
}
