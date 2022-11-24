package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Follower;
import com.ssafy.health.model.service.FollowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/follower")
public class FollowerRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private FollowerService followerService;
    // 내가 팔로우 함
    @PostMapping("/follow")
    public ResponseEntity<String> insert(@RequestBody Follower follower){
        followerService.followUser(follower);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    // 내가 팔로우 하고 있는 사람
    @GetMapping("/{userId}")
    public ResponseEntity<List<Follower>> list(@PathVariable String userId){

        List<Follower> list = followerService.getFollowerList(userId);
        return new ResponseEntity<List<Follower>>(list, HttpStatus.OK);
    }
    // 나를 팔로우 하고 있는 사람
    @GetMapping("/following/{followerId}")
    public ResponseEntity<List<Follower>> followingList(@PathVariable String followerId){

        List<Follower> list = followerService.getFollowingList(followerId);
        return new ResponseEntity<List<Follower>>(list, HttpStatus.OK);
    }
    // 언팔
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody Follower follower){
        followerService.unfollowUser(follower);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    @PostMapping("/check")
    public ResponseEntity<Boolean> checkFollowing(@RequestBody Follower follower) {
        boolean check = followerService.checkStatus(follower);
        return new ResponseEntity<Boolean>(check, HttpStatus.OK);
    }

}
