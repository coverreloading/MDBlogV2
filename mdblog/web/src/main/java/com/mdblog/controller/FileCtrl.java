package com.mdblog.controller;

import com.mdblog.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Vincent on 16/10/21.
 */

@Controller
@RequestMapping(value = "/file")
public class FileCtrl {

    @Autowired
    private FileService fileService;

    //todo 前端未解决获取文件问题
    /**
     * 下载文章
     * restful  type:html,md
     * @param request
     * @param token
     * @param type
     * @param content
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "download/{token}/{type}")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @PathVariable(value = "token") String token,
                                           @PathVariable(value = "type") String type,
                                           String content)throws IOException {

        if(token!=null&&type!=null&&content!=null){
            String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload/temp");
            return fileService.downloadFile(token, type, content, realPath);
        }else {
            return null;
        }
    }
}

