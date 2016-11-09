package com.mdblog.service;

import org.springframework.http.ResponseEntity;

/**
 * Created by Vincent on 16/10/21.
 */
public interface FileService {
    ResponseEntity<byte[]> downloadFile(String token, String type, String content, String realPath);
}
