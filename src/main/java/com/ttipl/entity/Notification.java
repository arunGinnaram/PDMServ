package com.ttipl.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Notification")
@Data
public class Notification {
	
	@Id
	@Column(name="notification_id")
	private int notificationId;
	
	@Column(name="is_multiple_year_rect")
	private Boolean isMultipleYearRect;
	
	@Column(name="is_notification_closed")
	private Boolean isNotificationClosed;
	
	@Column(name="is_notification_started")
	private Boolean isNotificationStarted;
	
	@Column(name="notification_date")
	private LocalDate notificationDate;
	
	@Column(name="notification_name")
	private String notificationName;
	
	@Column(name="notification_no",nullable=false)
	private String notificationNo;
	
	@Column(name="post_name")
	private String postName;
	
	@Column(name="rect_year")
	private String rectYear;
	
	@Column(name="rect_year_end")
	private String rectYearEnd;

}
