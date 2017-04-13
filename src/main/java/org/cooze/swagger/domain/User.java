package org.cooze.swagger.domain;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private Integer age;
    private Integer id;
    private String desc;

    public User() {
    }

    public User(String name, Integer age, Integer id,
                String desc) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
