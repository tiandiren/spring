package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.service.ActionClass;

/**
 * 基于XML的显式配置
 * @author liumi
 *
 */
@Configuration
public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ActionClass action = context.getBean(ActionClass.class);
		action.doAction("基于XML的显式配置");
	}

}
