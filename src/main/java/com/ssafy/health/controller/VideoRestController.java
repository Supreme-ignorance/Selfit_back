package com.ssafy.health.controller;

import com.ssafy.health.model.dto.Video;
import com.ssafy.health.model.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/video")
public class VideoRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private VideoService videoService;

    @GetMapping("/list")
    public ResponseEntity<List<Video>> videolist(@RequestParam(defaultValue = "모두") String videoType,
												 @RequestParam(defaultValue = "view_cnt") String orderBy,
												 @RequestParam(defaultValue = "ASC") String orderDir) {
        System.out.println(videoType);
        System.out.println(orderBy);
        System.out.println(orderDir);

        Map<String, String> params = new HashMap<>();

        params.put("videoType", videoType);
        params.put("orderBy", orderBy);
        params.put("orderDir", orderDir);

        List<Video> list = videoService.getVideoList(params);

        return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
    }

    @GetMapping("/one/{videoId}")
    public ResponseEntity<Video> videoOne(@PathVariable String videoId) {

        Video video = videoService.getVideo(videoId);
        videoService.upViewCnt(videoId);

        return new ResponseEntity<Video>(video, HttpStatus.OK);
    }

    @GetMapping("/likedlist/{id}")
    public ResponseEntity<List<Video>> videolist(@PathVariable String id) {

        List<Video> list = videoService.getLikedVideoList(id);

        return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
    }

    @PostMapping ("/like")
    public ResponseEntity<String> likeVideo(@RequestParam String videoId,
                                                 @RequestParam String id) {
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("id", id);

        videoService.likeVideo(params);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    @GetMapping("/checklist/{id}")
    public ResponseEntity<Boolean> checkLikedVideoList (@RequestParam String videoId,
                                                        @RequestParam String id) {
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("id", id);
        boolean check = videoService.getLikedVideoList(params);
        return new ResponseEntity<Boolean>(check, HttpStatus.OK);
    }


    @PostMapping("/unlike")
    public ResponseEntity<String> unlikeVideo(@RequestParam String videoId,
                                              @RequestParam String id) {
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("id", id);

        videoService.unlikeVideo(params);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }
}
