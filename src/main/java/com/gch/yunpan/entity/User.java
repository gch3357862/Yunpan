package com.gch.yunpan.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
public class User implements Serializable {

    private int id;

    private String account;

    private String password;

    private String name;

    private Date createTime;

}
