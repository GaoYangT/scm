package com.son.son.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class User {
    @Id
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    private Integer user_age;
    private  String user_sex;
}
