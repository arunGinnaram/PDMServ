package com.ttipl.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttipl.ExceptionHandler.CustomException;
import com.ttipl.entity.Notification;
import com.ttipl.entity.PersonalDetails;
import com.ttipl.repository.NotificationRepo;
import com.ttipl.serviceInterface.IPersonalDetailsSer;
import com.ttipl.utility.NetworkUtility;

@RestController
@RequestMapping("/saveController")
@CrossOrigin("*")
public class DataController {
	
	@Autowired
	private IPersonalDetailsSer iPersonalDetailsSer; 
	
	 
	
	@GetMapping("/getNotifications")
	public ResponseEntity<?> getNot() throws CustomException {		
		try {			 
		return new ResponseEntity<>(iPersonalDetailsSer.getNotificationList(),HttpStatus.ACCEPTED);
//		return new ResponseEntity<>("Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
		}catch(Exception da) {
			return new ResponseEntity<>(da.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/savePersonalDetails")
	public ResponseEntity<String> savePersonalDetails(@RequestBody PersonalDetails personalDet) {
		System.out.println("PD: " + personalDet);
		try {
			personalDet.setDateCreated(LocalDateTime.now());
			personalDet.setIpAddress(NetworkUtility.IPAddress());
			String personNumber = personalDet.getPersonNumber();
			PersonalDetails findByPN = iPersonalDetailsSer.findByPN(personNumber);
			if(findByPN==null) {	
				PersonalDetails save = iPersonalDetailsSer.savePersonalDetails(personalDet);		
				if(save!=null) {
					return new ResponseEntity<String>("Data Saved Successfully",HttpStatus.ACCEPTED);
				}else {
					return new ResponseEntity<String>("Failed to Save Data",HttpStatus.INTERNAL_SERVER_ERROR);
				}				
			}else {
				return new ResponseEntity<String>("Personal Number already exist",HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			
			
		}catch(Exception e) {		
			return new ResponseEntity<String>("Failed to Save Data"+ e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
	}
	
	@GetMapping("/getpd") 
	public ResponseEntity<List<PersonalDetails>> getPD() { 
		return new ResponseEntity<>(iPersonalDetailsSer.getPDAll(),HttpStatus.OK);
	}
	
}
