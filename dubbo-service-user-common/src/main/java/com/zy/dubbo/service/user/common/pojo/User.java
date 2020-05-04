package com.zy.dubbo.service.user.common.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private long id;
    private String name;
    private String age;
    private String high;
    private String desc;

    public User(long id, String name, String age, String high, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.high = high;
        this.desc = desc;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", high='" + high + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
