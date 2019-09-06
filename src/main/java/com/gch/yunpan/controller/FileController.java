package com.gch.yunpan.controller;

import com.gch.yunpan.request.YunFileRequest;
import com.gch.yunpan.service.YunFileService;
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

    @PostMapping("/file/add")
    public String add(YunFileRequest yunFileRequest) {
        return fileService.insert(yunFileRequest);
    }

    @PostMapping("/file/download")
    public String download(YunFileRequest yunFileRequest) {
        return fileService.download(yunFileRequest);
    }

}
