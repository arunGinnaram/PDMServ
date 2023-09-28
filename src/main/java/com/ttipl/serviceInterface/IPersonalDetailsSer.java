package com.ttipl.serviceInterface;

import java.util.List;

import com.ttipl.ExceptionHandler.CustomException;
import com.ttipl.entity.Notification;
import com.ttipl.entity.PersonalDetails;

public interface IPersonalDetailsSer {
	
	public PersonalDetails savePersonalDetails(PersonalDetails persDet) ;

	
	public PersonalDetails findByPN(String personNumber);


	public List<PersonalDetails> getPDAll();


	public List<Notification> getNotificationList()  throws CustomException ;

}
