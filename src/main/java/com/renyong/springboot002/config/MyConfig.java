package com.renyong.springboot002.config;

import com.renyong.springboot002.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther 任勇勇
 * @Date: 2019/08/17 15:14
 * @Description:
 * @Configuration 指明该类是一个配置类
    以前在xml中用bean标签添加
    现在用注解@Bean
  @Bean 将方法返回值添加到容器中，bean的默认名称就是方法名
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
