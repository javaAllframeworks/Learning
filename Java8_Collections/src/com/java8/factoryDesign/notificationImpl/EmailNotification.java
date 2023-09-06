/**
 * 
 */
package com.java8.factoryDesign.notificationImpl;

import com.java8.factoryDesign.notification.Notification;

/**
 * 
 */
public class EmailNotification implements Notification {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending an e-mail notification");
	}
}

