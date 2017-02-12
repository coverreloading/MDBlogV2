package com.mdblog.controller;

import com.mdblog.service.PictureService;
import com.mdblog.common.utils.JsonUtils;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Vincent on 16/10/27.
 */
@Controller
@RequestMapping("/pic")
public class PictureCtrl {

    @Autowired
    private PictureService pictureService;

    /**
     * mdeditor上传图片
     * @param token
     * @param uploadFile
     * @return
     */
    @RequestMapping(value = "/uploadArticlePic/{token}")
    @ResponseBody
    public Map uploadArticlePic(@PathVariable(value = "token") String token, @RequestParam(value = "editormd-image-file") MultipartFile uploadFile) {
        Map result = pictureService.uploadAPicture(token, uploadFile);
        return result;
    }


    /**
     *  mdeditor上传图片案例
     * @param request
     * @param response
     * @param attach
     */

    @RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
    public void hello(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "editormd-image-file", required = false) MultipartFile attach) {
        try {
            request.setCharacterEncoding("utf-8");
            response.setHeader("Content-Type", "text/html");
            String rootPath = request.getSession().getServletContext().getRealPath("/resources/upload/");
            // 文件路径不存在则需要创建文件路径

            File filePath = new File(rootPath);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            //最终文件名
            File realFile = new File(rootPath + File.separator + attach.getOriginalFilename());
            FileUtils.copyInputStreamToFile(attach.getInputStream(), realFile);
            //下面response返回的json格式是editor.md所限制的，规范输出就OK
            response.getWriter().write("{\"success\": 1, \"message\":\"上传成功\",\"url\":\"/resources/upload/" + attach.getOriginalFilename() + "\"}");
        } catch (Exception e) {
            try {
                response.getWriter().write("{\"success\":0}");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }


    /**
     * 发布上传封面
     * @param token
     * @param articleId
     * @param uploadFile
     * @return
     */
    @RequestMapping(value = "/uploadArticleMainPic/{token}/{articleId}", method = RequestMethod.POST)
    @ResponseBody
    public Map uploadArticleMainPic(@PathVariable(value = "token") String token,@PathVariable(value = "articleId") Long articleId, @RequestParam(value = "mainPic", required = false) MultipartFile uploadFile) {
        Map result = pictureService.uploadRAPicture(token,articleId, uploadFile);
        return result;
    }

    /**
     * 上传头像
     * @param token
     * @param uploadFile
     * @return
     */
    @RequestMapping(value = "/user/{token}", method = RequestMethod.POST)
    @ResponseBody
    public Map uploadUserPic(@PathVariable(value = "token") String token,MultipartFile uploadFile) {
        Map result = pictureService.uploadUserPicture(token,uploadFile);
        return result;
    }
}
