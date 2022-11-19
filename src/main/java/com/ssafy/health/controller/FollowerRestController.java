package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Follower;
import com.ssafy.health.model.service.FollowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/follower")
public class FollowerRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private FollowerService followerService;

    @PostMapping("/follow")
    public ResponseEntity<String> insert(@RequestBody Follower follower){
        followerService.followUser(follower);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }


    @GetMapping("/{userId}")
    public ResponseEntity<List<Follower>> list(@PathVariable String userId){

        List<Follower> list = followerService.getFollowerList(userId);
        return new ResponseEntity<List<Follower>>(list, HttpStatus.OK);
    }

}
