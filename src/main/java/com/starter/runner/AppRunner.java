package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.starter.service.INotification;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private INotification service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		service.notificate();
	}

}
