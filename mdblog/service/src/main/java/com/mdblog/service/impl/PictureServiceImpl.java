package com.mdblog.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


import com.alibaba.fastjson.JSON;
import com.mdblog.mapper.ArticleMapper;
import com.mdblog.po.Article;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.service.PictureService;
import com.mdblog.service.UserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mdblog.common.utils.IDUtils;
import com.mdblog.common.utils.FtpUtil;

@Service("PictureService")
public class PictureServiceImpl implements PictureService {

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

	@Autowired
	private UserService userService;
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public Map uploadPicture(String token,String imagePath, MultipartFile uploadFile) {
		// 万物根本 返回json包含(success,message,url)
		Map resultMap = new HashMap();
		// 验证用户token是否过期
		Long userId = userService.getUserIdByToken(token);
		// token过期，返回错误状态码
		if (userId == -1) {
			resultMap.put("success", 0);
			resultMap.put("message", "文件上传失败");
			return resultMap;
		}
		try {
			// 生成一个新的文件名
			// 取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 生成新文件名
			// UUID.randomUUID();
			// 本处使用工具类生成新文件名，不使用uuid
			String newName = IDUtils.genImageName();
			// 补全文件后缀
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 图片上传地址，加上userId作为分类文件夹分类标准
			imagePath="/"+ userId + imagePath;
			// 调用方法上传文件
			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD,
					FTP_BASE_PATH, imagePath, newName, uploadFile.getInputStream());
			// 返回结果
			if(!result) {
				// 失败，返回失败状态
				resultMap.put("success", 0);
				resultMap.put("message", "文件上传失败");
				return resultMap;
			}
			// 组合文件地址，用于返回到前端
			String url =IMAGE_BASE_URL + imagePath + "/" + newName;
			// 成功，存入map，返回
			resultMap.put("success", 1);
			resultMap.put("message","上传成功");
			resultMap.put("url", url);
			return resultMap;
		} catch (Exception e) {
			// 异常，返回失败状态
			resultMap.put("success", 0);
			resultMap.put("message", "文件上传发生异常");
			return resultMap;
		}
	}

	@Override
	public Map uploadAPicture(String token, MultipartFile uploadFile) {
		// 万物根本 返回json包含(success,message,url)
		String imagePath ="/art"+ new DateTime().toString("/yyyy/MM/dd");
		return uploadPicture(token, imagePath, uploadFile);
	}

	@Override
	public Map uploadRAPicture(String token ,Long articleId, MultipartFile uploadFile) {
		// 万物根本 返回json包含(success,message,url)
		String imagePath ="/art"+ new DateTime().toString("/yyyy/MM/dd");
		Map resultMap = new HashMap();
		resultMap = uploadPicture(token, imagePath, uploadFile);

		Article articleFromDB = articleMapper.selectByPrimaryKey(articleId);
		articleFromDB.setaPic(String.valueOf(resultMap.get("url")));
		articleMapper.updateByPrimaryKey(articleFromDB);

		return resultMap;
	}

	@Override
	public Map uploadUserPicture(String token , MultipartFile uploadFile) {
		// 万物根本 返回json包含(success,message,url)
		String imagePath ="/upic";
		return uploadPicture(token, imagePath, uploadFile);
	}
}
