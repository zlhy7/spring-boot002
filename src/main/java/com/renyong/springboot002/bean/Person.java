package com.renyong.springboot002.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @auther 任勇勇
 * @Date: 2019/08/17 13:52
 * @Description:
 * 将配置文件中每一个属性配置到类属性中 利用注解@ConfigurationProperties
 * 只有这个组件是容器中的组件才能用@ConfigurationProperties，容器中的组件即被spring托管
 *
 *@PropertySource 加载指定配置文件，value属性是个数组，代表可加载多个配置文件
 */
@Component
@PropertySource("classpath:person.properties")
@Data
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
