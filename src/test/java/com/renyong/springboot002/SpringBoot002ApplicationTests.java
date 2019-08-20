package com.renyong.springboot002;

import com.renyong.springboot002.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot002ApplicationTests {
	@Autowired
	Person person;
	@Autowired
	ApplicationContext ioc;
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	/**
	 * 测试spring容器中是否存在helloService对象
	 */
	@Test
	public void test2(){
		boolean b= ioc.containsBean("helloService");
		System.out.println(b);
	}

}
