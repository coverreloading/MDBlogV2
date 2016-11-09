package com.mdblog.service.impl;

import com.mdblog.po.Article;
import com.mdblog.service.FileService;
import com.mdblog.service.UserService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Vincent on 16/10/21.
 */
@Service("FileService")
public class FileServiceImpl implements FileService {

    @Autowired
    private UserService userService;


    @Override
    public ResponseEntity<byte[]> downloadFile(String token, String type, String content, String realPath) {

        System.out.println("token= " + token);
        System.out.println("type= " + type);
        System.out.println("realPath= " + realPath);

        Long userId = userService.getUserIdByToken(token);
        if (userId == -1) {
            System.out.println("用户过期");
            return null;
        }
        if(content==null){
            System.out.println("content为空");
            return null;
        }
        // 判断类型
        if (!type.equals("html")&&!type.equals("md")) {
            System.out.println("type 输入有问题");
            return null;
        }
        String suffix = "";
        if (type.equals("html")) {
            suffix = ".html";
        } else if (type.equals("md")) {
            suffix = ".md";
        }
        // 剪切标题
        String[] text = content.split("\n");

        // 保存文件
        InputStream in_nocode = new ByteArrayInputStream(content.getBytes());
        String UUIDfileName=UUID.randomUUID().toString()+suffix;
        try {
            FileUtils.copyInputStreamToFile(in_nocode, new File(realPath,UUIDfileName));
            String path = realPath+"/"+UUIDfileName;
            File file = new File(path);
            HttpHeaders headers = new HttpHeaders();
            String returnFileName =text[0]+suffix;
            if(returnFileName ==null){
                returnFileName=new Date().toString()+suffix;
            }
            System.out.println(returnFileName);
            returnFileName = new String(returnFileName.getBytes("UTF-8"), "iso-8859-1"); //为了解决中文名称乱码问题
            headers.setContentDispositionFormData("attachment", returnFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                    headers, HttpStatus.CREATED);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
