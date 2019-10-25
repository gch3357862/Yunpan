package com.gch.yunpan.file.controller;

import com.gch.yunpan.file.request.YunFileRequest;
import com.gch.yunpan.file.service.YunFileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FileController {

    @Resource
    private YunFileService fileService;

    @GetMapping("/file/get")
    public String get(int ownerId) {
        return fileService.getByOwnerId(ownerId);
    }

    @PostMapping("/file/upload")
    public String upload(YunFileRequest yunFileRequest) {
        return fileService.upload(yunFileRequest);
    }

    @PostMapping("/file/download")
    public String download(YunFileRequest yunFileRequest) {
        return fileService.download(yunFileRequest);
    }

}
