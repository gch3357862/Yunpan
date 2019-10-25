package com.gch.yunpan.file.service;

import com.gch.yunpan.file.request.YunFileRequest;

public interface YunFileService {

    String getByOwnerId(int ownerId);

    String upload(YunFileRequest yunFileRequest);

    String download(YunFileRequest yunFileRequest);

}
