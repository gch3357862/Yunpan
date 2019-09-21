package com.gch.yunpan.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 6184149041697359717L;

    private int id;

    private String account;

    private String password;

    private String name;

    private Date createTime;

}
