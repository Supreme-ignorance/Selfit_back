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
@RequestMapping("/api/Video")
public class VideoRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private VideoService videoService;

    @GetMapping("/List")
    public ResponseEntity<List<Video>> videolist(@RequestParam(defaultValue = "모두") String viewPart,
												 @RequestParam(defaultValue = "view_cnt") String orderBy,
												 @RequestParam(defaultValue = "ASC") String orderDir) {
        Map<String, String> params = new HashMap<>();

        params.put("viewPart", viewPart);
        params.put("orderBy", orderBy);
        params.put("orderDir", orderDir);

        List<Video> list = videoService.getVideoList(params);

        return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
    }

    @GetMapping("/One/{videoId}")
    public ResponseEntity<Video> videoOne(@PathVariable String videoId) {

        Video video = videoService.getVideo(videoId);
        videoService.upViewCnt(videoId);

        return new ResponseEntity<Video>(video, HttpStatus.OK);
    }

    @GetMapping("/LikedList/{id}")
    public ResponseEntity<List<Video>> videolist(@PathVariable String id) {

        List<Video> list = videoService.getLikedVideoList(id);

        return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
    }

    @GetMapping("/Like")
    public ResponseEntity<String> likeVideo(@RequestParam String videoId,
                                                 @RequestParam String id) {
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("id", id);

        videoService.likeVideo(params);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    @GetMapping("/Unlike")
    public ResponseEntity<String> unlikeVideo(@RequestParam String videoId,
                                              @RequestParam String id) {
        Map<String, String> params = new HashMap<>();

        params.put("videoId", videoId);
        params.put("id", id);

        videoService.unlikeVideo(params);

        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }
}
