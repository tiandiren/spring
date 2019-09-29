package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActionClass {

	static Logger logger = LoggerFactory.getLogger(ActionClass.class);
	@Autowired
	private BeanClass beanClass;
	
	public void doAction(String name){
		beanClass.setBeanName(name);
		String str = beanClass.getCallTime() + " : call "+ beanClass.getBeanName();
		logger.info(str);
	}
}
