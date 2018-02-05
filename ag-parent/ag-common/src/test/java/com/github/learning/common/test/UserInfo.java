package com.github.learning.common.test;

import com.github.learning.common.util.jwt.IJWTInfo;

public class UserInfo implements IJWTInfo {
    private String uniqueName;
    private String name;
    private String id;
    private String password;
    private String sex;
    private int age;

    public UserInfo() {
    }

    public UserInfo(String uniqueName, String name, String id, String password) {
        this.uniqueName = uniqueName;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUniqueName() {
        return uniqueName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
