package com.gch.yunpan.file.mapper;

import com.gch.yunpan.file.entity.YunFile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YunFileMapper {

    YunFile selectById(int id);

    List<YunFile> selectByOwnerId(int ownerId);

    int insert(YunFile file);

}
