package com.ttipl.ExceptionHandler;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.dao.DataAccessException;

public class CustomException extends Exception {
	
	public CustomException(String message,DataAccessException da) {
		super(message,da);
	}
	  
}
