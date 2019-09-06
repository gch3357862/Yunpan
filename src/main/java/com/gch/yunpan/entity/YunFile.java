package com.gch.yunpan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YunFile implements Serializable {

    private static final long serialVersionUID = 8500494203176065445L;

    private int id;

    private int ownerId;

    private String name;

    private int size;

    private byte[] data;

    private Date createTime;

}
