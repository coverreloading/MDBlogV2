package com.mdblog.manage.controller;

import com.mdblog.service.ManagePictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by Vincent on 16/10/27.
 */
@Controller
@RequestMapping("/pic")
public class PictureCtrl {

    @Autowired
    private ManagePictureService ManagepictureService;

    // mdeditor上传图片
    @RequestMapping(value = "/subjectPic")
    @ResponseBody
    public Map uploadArticlePic(MultipartFile uploadFile) {
        Map result = ManagepictureService.uploadPicture(uploadFile);
        return result;
    }
}
