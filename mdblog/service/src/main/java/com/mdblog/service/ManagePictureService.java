package com.mdblog.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ManagePictureService {
	Map uploadPicture(MultipartFile uploadFile);
}
