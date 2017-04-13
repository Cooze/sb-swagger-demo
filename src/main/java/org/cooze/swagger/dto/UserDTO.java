package org.cooze.swagger.dto;

import java.io.Serializable;

/**
 * @author xianzhe_song
 * @version 1.0.0
 * @desc
 * @date 2017/4/13
 */
public class UserDTO implements Serializable{
    private String name;
    private Integer age;
    private String desc;


    public UserDTO(){}
    public UserDTO(String name, Integer age, String desc) {
        this.name = name;
        this.age = age;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
