package com.gch.yunpan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 6184149041697359717L;

    private int id;

    private String account;

    private String password;

    private String name;

    private Date createTime;

}
