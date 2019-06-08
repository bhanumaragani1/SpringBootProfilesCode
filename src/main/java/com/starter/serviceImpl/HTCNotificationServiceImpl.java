package com.starter.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.starter.service.INotification;

@Component
@Profile("htc")
public class HTCNotificationServiceImpl implements INotification {

	@Override
	public void notificate() {

		System.out.println("only for HTC profile");
	}

}
