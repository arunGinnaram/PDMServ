package com.ttipl.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ttipl.entity.PersonalDetails;

@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetails, Serializable> {
	
	@Query(value="Select * from personal_details where person_number=?1",nativeQuery=true)
	public PersonalDetails findByPN(String personNumber);

}
