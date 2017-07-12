package com.sein.pojo.po;

import javax.persistence.Column;

/**
 * Created by ldb on 2017/3/28.
 */
public class Account {

    //主键
    private Integer id;
    //用户名
    @Column(name = "userName")
    private String userName;
    //密码
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
