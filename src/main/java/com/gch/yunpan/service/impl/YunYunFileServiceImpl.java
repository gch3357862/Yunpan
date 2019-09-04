package com.gch.yunpan.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.gch.yunpan.entity.YunFile;
import com.gch.yunpan.mapper.YunFileMapper;
import com.gch.yunpan.request.YunFileRequest;
import com.gch.yunpan.service.YunFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

@Service
public class YunYunFileServiceImpl implements YunFileService {

    @Resource
    private YunFileMapper yunFileMapper;

    @Override
    public String getByOwnerId(int ownerId) {
        JSONObject result = new JSONObject();
        List<YunFile> list = yunFileMapper.selectByOwnerId(ownerId);
        result.put("data", list);
        result.put("total", list.size());
        return result.toJSONString();
    }

    @Override
    public String insert(YunFileRequest yunFileRequest) {
        JSONObject result = new JSONObject();
        YunFile yunFile = new YunFile();
        yunFile.setOwnerId(yunFileRequest.getOwnerId());
        try {
            yunFile.setData(yunFileRequest.getData().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        yunFile.setName(yunFileRequest.getData().getOriginalFilename());
        yunFile.setSize((int)yunFileRequest.getData().getSize());
        int count = yunFileMapper.insert(yunFile);
        if(count > 0){
            result.put("res", "success");
        }
        else{
            result.put("res", "fail");
        }
        return result.toJSONString();
    }

    @Override
    public String download(YunFileRequest yunFileRequest){
        YunFile yunFile = yunFileMapper.selectById(yunFileRequest.getId());
        File file = new File(yunFileRequest.getLocation() + yunFile.getName());
        try {
            file.createNewFile();
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(yunFile.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject result = new JSONObject();
        result.put("res", "success");
        return result.toJSONString();
    }

}
