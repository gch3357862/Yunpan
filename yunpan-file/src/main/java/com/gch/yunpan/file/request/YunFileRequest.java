package com.gch.yunpan.file.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class YunFileRequest implements Serializable {

    private static final long serialVersionUID = 326451472379321916L;

    private int id;

    private int ownerId;

    private String name;

    private int size;

    private MultipartFile data;

    private Date createTime;

    private String location;

}
