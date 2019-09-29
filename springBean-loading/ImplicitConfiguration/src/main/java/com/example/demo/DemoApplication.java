package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.ActionClass;

/**
 * 基于XML的隐式配置
 * @author liumi
 *
 */
@Configuration
// 不使用@ComponentScan注解而直接使用beans.xml中的component-scan也可以完成自动装配
@ComponentScan(basePackages={"com.example.demo"})
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		//配合component-scan完成自动装配
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ActionClass action = context.getBean(ActionClass.class);
		
		action.doAction("基于自动装配的隐式配置");
	}

}
