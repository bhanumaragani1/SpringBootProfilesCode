package com.starter.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.starter.service.INotification;

@Component
@Profile("default")
public class NotificationServiceImpl implements INotification{

	@Override
	public void notificate() {
		System.out.println("Common for all");		
	}

}
