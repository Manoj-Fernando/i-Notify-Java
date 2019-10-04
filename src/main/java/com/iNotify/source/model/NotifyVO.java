/**
 * 
 */
package com.iNotify.source.model;

import java.util.Date;

/**
 * @author Manoj Fernando A
 *
 */
public class NotifyVO {
	
	long notifyId;
	String notificationnName;
	String description;
	Date reminderDate;
	public long getNotifyId() {
		return notifyId;
	}
	public void setNotifyId(long notifyId) {
		this.notifyId = notifyId;
	}
	public String getNotificationnName() {
		return notificationnName;
	}
	public void setNotificationnName(String notificationnName) {
		this.notificationnName = notificationnName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReminderDate() {
		return reminderDate;
	}
	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}
	
	

}
