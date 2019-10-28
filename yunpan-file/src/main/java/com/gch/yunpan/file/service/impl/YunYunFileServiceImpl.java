package com.gch.yunpan.file.service.impl;

import com.gch.yunpan.common.utils.JsonUtil;
import com.gch.yunpan.file.entity.YunFile;
import com.gch.yunpan.file.mapper.YunFileMapper;
import com.gch.yunpan.file.request.YunFileRequest;
import com.gch.yunpan.file.service.YunFileService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

@Service
public class YunYunFileServiceImpl implements YunFileService {

    @Resource
    private YunFileMapper yunFileMapper;

    @Override
    public String getByOwnerId(int ownerId) {
        List<YunFile> list = yunFileMapper.selectByOwnerId(ownerId);
        return JsonUtil.createSuccessResponse(list);
    }

    @Override
    public String upload(YunFileRequest yunFileRequest) {
        YunFile yunFile = new YunFile();
        yunFile.setOwnerId(yunFileRequest.getOwnerId());
        try {
            yunFile.setData(yunFileRequest.getData().getBytes());
        } catch (Exception e) {
            return JsonUtil.createFailResponse("Error uploading file.");
        }
        yunFile.setName(yunFileRequest.getData().getOriginalFilename());
        yunFile.setSize(yunFileRequest.getData().getSize());
        int count = yunFileMapper.insert(yunFile);
        if(count > 0) {
            return JsonUtil.createSuccessResponse();
        }
        else {
            return JsonUtil.createFailResponse("Error uploading file.");
        }
    }

    @Override
    public String download(YunFileRequest yunFileRequest) {
        YunFile yunFile = yunFileMapper.selectById(yunFileRequest.getId());
        File file = new File(yunFileRequest.getLocation() + yunFile.getName());
        try {
            if(file.createNewFile()) {
                OutputStream outputStream = new FileOutputStream(file);
                outputStream.write(yunFile.getData());
                outputStream.close();
            }
        } catch (Exception e) {
            return JsonUtil.createFailResponse("Error downloading file.");
        }
        return JsonUtil.createSuccessResponse();
    }

}
