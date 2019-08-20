package com.renyong.springboot002.bean;

import lombok.Data;

/**
 * @auther 任勇勇
 * @Date: 2019/08/17 13:57
 * @Description:
 */
@Data
public class Dog {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
