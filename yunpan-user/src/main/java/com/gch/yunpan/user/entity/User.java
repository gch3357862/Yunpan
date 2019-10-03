package com.gch.yunpan.user.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 3549091203127704908L;

    private int id;

    private String account;

    private String password;

    private String name;

    private Date createTime;

}
