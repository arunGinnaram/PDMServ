package com.ttipl.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttipl.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Serializable> {

}
