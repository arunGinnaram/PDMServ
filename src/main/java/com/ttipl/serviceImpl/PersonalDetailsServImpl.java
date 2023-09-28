package com.ttipl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ttipl.ExceptionHandler.CustomException;
import com.ttipl.entity.Notification;
import com.ttipl.entity.PersonalDetails;
import com.ttipl.repository.NotificationRepo;
import com.ttipl.repository.PersonalDetailsRepo;
import com.ttipl.serviceInterface.IPersonalDetailsSer;

@Service
public class PersonalDetailsServImpl implements IPersonalDetailsSer{
	
	@Autowired
	private PersonalDetailsRepo personalDetailsRepo;
	
	@Autowired
	private NotificationRepo notRepo;

	@Override
	public PersonalDetails savePersonalDetails(PersonalDetails persDet) {		
		return personalDetailsRepo.save(persDet);
	}

	@Override
	public PersonalDetails findByPN(String personNumber) {		 
		return personalDetailsRepo.findByPN(personNumber);
	}

	@Override
	public List<PersonalDetails> getPDAll() { 
		return personalDetailsRepo.findAll();
	}

	@Override
	public List<Notification> getNotificationList() throws CustomException {	
		try {
			return notRepo.findAll();			 
		}catch(DataAccessException e) {
			throw new CustomException("Unable to get Notification list", e);
		}
		
	}

}
