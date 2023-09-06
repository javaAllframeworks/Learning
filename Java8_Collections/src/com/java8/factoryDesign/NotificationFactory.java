package com.java8.factoryDesign;

import com.java8.factoryDesign.notification.Notification;
import com.java8.factoryDesign.notificationImpl.EmailNotification;
import com.java8.factoryDesign.notificationImpl.PushNotification;
import com.java8.factoryDesign.notificationImpl.SMSNotification;

public class NotificationFactory {
	public Notification createNotification(String channel)
	{
		if (channel == null || channel.isEmpty())
			return null;
		switch (channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown channel "+channel);
		}
	}
}

