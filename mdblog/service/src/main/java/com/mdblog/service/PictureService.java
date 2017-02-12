package com.mdblog.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

	// 上传图像
	Map uploadPicture(String token,String imagePath, MultipartFile uploadFile);

	// 文章内插入图片
	Map uploadAPicture(String token, MultipartFile uploadFile);

	// 上传文章封面
	Map uploadRAPicture(String token, Long articleId, MultipartFile uploadFile);

	// 上传头像
    Map uploadUserPicture(String token,MultipartFile uploadFile);
}
