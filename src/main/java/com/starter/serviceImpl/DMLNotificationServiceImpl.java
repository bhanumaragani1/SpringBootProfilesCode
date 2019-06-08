package com.starter.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.starter.service.INotification;

@Component
@Profile("dml")
public class DMLNotificationServiceImpl implements INotification{

	@Override
	public void notificate() {

		System.out.println("Only for DML profile");
	}

}
