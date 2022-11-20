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
    public List<Article> getArticleList(Map<String, String> params) {
        return articleDao.selectList(params);
    }

    @Override
    public void write(Article article) {
        articleDao.insert(article);
    }

    @Override
    public int modify(Article article) {
        return articleDao.update(article);
    }

    @Override
    public Article detail(int articleId) {
        return articleDao.selectOne(articleId);
    }

    @Override
    public int delete(int articleId) {
        return articleDao.delete(articleId);
    }

    @Override
    public void updateViewCnt(int articleId) {
        articleDao.updateViewCnt(articleId);
    }
}
