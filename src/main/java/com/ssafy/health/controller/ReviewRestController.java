package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Review;
import com.ssafy.health.model.service.ReviewService;
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
    private ReviewService reviewService;

    @PostMapping("/write")
    public ResponseEntity<String> insert(@RequestBody Review review){

        reviewService.writeReview(review);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }
    @GetMapping("/list/{videoId}")
    public ResponseEntity<List<Review>> list(@PathVariable String videoId,
                                             @RequestParam(defaultValue = "ASC") String orderDir){
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("orderDir", orderDir);

        List<Review> list = reviewService.getReviewList(params);

        return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Review> detail(@PathVariable int reviewId){

        Review review = reviewService.detailReview(reviewId);

        return new ResponseEntity<Review>(review, HttpStatus.OK);
    }

    @PutMapping("/modify")
    public ResponseEntity<Review> modify(Review review){

        reviewService.modifyReview(review);

        return new ResponseEntity<Review>(review, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{reviewId}")
    public ResponseEntity<String> delete(@PathVariable int reviewId){

        if (reviewService.deleteReview(reviewId) > 0)
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        else
            return new ResponseEntity<String>(FAIL, HttpStatus.OK);
    }
}