package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.ActionClass;
import com.example.demo.service.BeanConfiguration;

/**
 * 基于java的显式配置
 * @author liumi
 *
 */
@Configuration
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class);
		context.refresh();
		
		ActionClass action = context.getBean(ActionClass.class);
		action.doAction("基于java的显式配置");
	}

}
