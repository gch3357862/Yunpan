package com.gch.yunpan.service;

import com.gch.yunpan.request.YunFileRequest;

public interface YunFileService {

    String getByOwnerId(int ownerId);

    String insert(YunFileRequest yunFileRequest);

    String download(YunFileRequest yunFileRequest);

}
