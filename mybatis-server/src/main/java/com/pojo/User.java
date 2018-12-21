package com.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/12/21 10:28
 * @email: linma@homeinns.com
 **/
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private Date birthday;
}
