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
@RequestMapping("/api/article")
public class ArticleRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private ArticleService articleService;

    @PostMapping("/write")
    public ResponseEntity<String> insert(@RequestBody Article article){
        articleService.write(article);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    @GetMapping("/list/{boardSeq}")
    public ResponseEntity<List<Article>> list(@PathVariable String boardSeq,
                                              @RequestParam(defaultValue = "DESC") String orderDir, @RequestParam(defaultValue = "article_id") String oderBy){
        Map<String, String> params = new HashMap<>();

        params.put("boardSeq", boardSeq);
        params.put("orderDir", orderDir);
        params.put("oderBy", oderBy);

        List<Article> list = articleService.getArticleList(params);

        return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<?> detail(@PathVariable int articleId){

        Article article = articleService.detail(articleId);
        articleService.updateViewCnt(articleId);
        if (article.getTitle().equals(""))
            return new ResponseEntity<Object>(null, HttpStatus.BAD_REQUEST);
        else
            return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @PutMapping("/modify")
    public ResponseEntity<Article> modify(@RequestBody Article article){

        articleService.modify(article);

        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{articleId}")
    public ResponseEntity<String> delete(@PathVariable int articleId){

        System.out.println(articleId);

        if (articleService.delete(articleId) > 0)
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        else
            return new ResponseEntity<String>(FAIL, HttpStatus.OK);
    }
}
