package com.java8.factoryDesign.service;

import com.java8.factoryDesign.NotificationFactory;
import com.java8.factoryDesign.notification.Notification;

public class NotificationService {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("EMAIL");
		notification.notifyUser();
	}
}

