package com.mdblog.service.impl;

import com.alibaba.fastjson.JSON;
import com.mdblog.service.ManagePictureService;
import com.mdblog.service.PictureService;
import com.mdblog.common.utils.FtpUtil;
import com.mdblog.common.utils.IDUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Service("ManagePictureService")
public class ManagePictureServiceImpl implements ManagePictureService {
	
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;


	@Override
	public Map uploadPicture(MultipartFile uploadFile) {
		// 万物根本 返回json包含(success,message,url)
		Map resultMap = new HashMap();
        try {
			//生成一个新的文件名
			//取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			//生成新文件名
			//UUID.randomUUID();
			String newName = IDUtils.genImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			//图片上传

			String imagePath ="/subjectPic";
			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, 
					FTP_BASE_PATH, imagePath, newName, uploadFile.getInputStream());
			//返回结果
			if(!result) {
				resultMap.put("status", 0);
				resultMap.put("message", "文件上传失败");
				return resultMap;
			}
			resultMap.put("status", 1);
			resultMap.put("message","上传成功");
			resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
			System.out.println(JSON.toJSONString(resultMap));
			System.out.println(resultMap.toString());
			return resultMap;
			
		} catch (Exception e) {
			resultMap.put("status", 0);
			resultMap.put("message", "文件上传发生异常");
			return resultMap;
		}
	}
}
