package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public ActionClass getActionClass(){
		return new ActionClass();
	}
	
	@Bean
	public BeanClass getBeanClass(){
		return new BeanClass();
	}
}
