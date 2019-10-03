package com.gch.yunpan.file.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class YunFile implements Serializable {

    private static final long serialVersionUID = -6400404080755072989L;

    private int id;

    private int ownerId;

    private String name;

    private int size;

    private byte[] data;

    private Date createTime;

}
