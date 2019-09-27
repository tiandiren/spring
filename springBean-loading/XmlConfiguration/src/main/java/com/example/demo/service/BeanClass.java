package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BeanClass {

	private String beanName;
	private Date callTime;
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public Date getCallTime() {
		return new Date();
	}
	
	
}
