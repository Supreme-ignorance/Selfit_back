package com.ssafy.health.model.service;

import com.ssafy.health.model.dao.VideoDao;
import com.ssafy.health.model.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDao videoDao;

	@Override
	public List<Video> getVideoList(Map<String, String> params) {
		return videoDao.selectList(params);
	}

	@Override
	public Video getVideo(String videoId) {
		return videoDao.selectVideoById(videoId);
	}

	@Override
	public List<Video> getLikedVideoList(String id) {
		return videoDao.selectLikedVideoList(id);
	}

	// 좋아요 목록에 있는지 확인
	@Override
	public boolean getLikedVideoList(Map<String, String> params) {
		if (videoDao.selectLikedVideo(params) == null)
			return true;
		else
			return false;
	}

	@Override
	public void likeVideo(Map<String, String> params) {
		if (getLikedVideoList(params)) {
			videoDao.updateLikeCount(params.get("videoId"));
			videoDao.insertLikedVideo(params);
		}
	}

	@Override
	public void unlikeVideo(Map<String, String> params) {
		if (!getLikedVideoList(params)) {
			videoDao.subtractLikeCount(params.get("videoId"));
			videoDao.deleteLikedVideo(params);
		}
	}

	@Override
	public void upViewCnt(String videoId) {
		videoDao.updateViewCount(videoId);
	}
}


