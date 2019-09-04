package com.gch.yunpan.mapper;

import com.gch.yunpan.entity.YunFile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YunFileMapper {

    YunFile selectById(int id);

    List<YunFile> selectByOwnerId(int ownerId);

//    List<File> selectByName(String name);
//
    int insert(YunFile file);
//
//    int updateName(File file);
//
//    int delete(int id);

}
