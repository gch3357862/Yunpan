package com.gch.yunpan.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YunFileRequest implements Serializable {

    private int id;

    private int ownerId;

    private String name;

    private int size;

    private MultipartFile data;

    private Date createTime;

    private String location;
}
