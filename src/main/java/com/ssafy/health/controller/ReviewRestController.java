package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Article;
import com.ssafy.health.model.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/review")
public class ReviewRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private ArticleService articleService;

    @PostMapping("/write")
    public ResponseEntity<String> insert(@RequestBody Article article){

        articleService.writeReview(article);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }
    @GetMapping("/list/{videoId}")
    public ResponseEntity<List<Article>> list(@PathVariable String videoId,
                                              @RequestParam(defaultValue = "ASC") String orderDir){
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("orderDir", orderDir);

        List<Article> list = articleService.getReviewList(params);

        return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Article> detail(@PathVariable int reviewId){

        Article article = articleService.detailReview(reviewId);

        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @PutMapping("/modify")
    public ResponseEntity<Article> modify(Article article){

        articleService.modifyReview(article);

        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{reviewId}")
    public ResponseEntity<String> delete(@PathVariable int reviewId){

        if (articleService.deleteReview(reviewId) > 0)
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        else
            return new ResponseEntity<String>(FAIL, HttpStatus.OK);
    }
}
