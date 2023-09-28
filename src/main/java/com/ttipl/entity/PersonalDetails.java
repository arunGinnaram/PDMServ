package com.ttipl.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personalDetails")
public class PersonalDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="personNumber",length = 15,unique = true)
	private String personNumber;
	
	@Column(name="personName",length = 60)
	private String personName;
	
	@Column(name="fatherName",length = 60)
	private String fatherName;
	
	@Column(name="currentPostName",length = 60)
	private String currentPostName;
	
	
	
	@Column(name="def_nonDef",length = 60)
	private String def_nonDef;
	
	@Column(name="zone",length = 60)
	private String zone;
	
	@Column(name="rangeArea",length = 60)
	private String range;
	
	@Column(name="district_unit",length = 60)
	private String district_unit;
	
	
	
	@Column(name="dob",columnDefinition = "Date")
	private LocalDate dateOfBirth;
	
	
	@Column(name="dateOfEnlishment_joining",columnDefinition = "Date")
	private LocalDate dateOfEnlishment_joining;
	
	@Column(name="dateOfBecomingConstDriver",columnDefinition = "Date")
	private LocalDate dateOfBecomingConstDriver;
	
	
	
	@Column(name="rollVolumes",length = 10)
	private String rollVolumes;
	
	@Column(name="ipAddress")
	private String ipAddress;
	
	@Column(name="dateCreated",columnDefinition = "TIMESTAMP")
	private LocalDateTime dateCreated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCurrentPostName() {
		return currentPostName;
	}

	public void setCurrentPostName(String currentPostName) {
		this.currentPostName = currentPostName;
	}

	public String getDef_nonDef() {
		return def_nonDef;
	}

	public void setDef_nonDef(String def_nonDef) {
		this.def_nonDef = def_nonDef;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getDistrict_unit() {
		return district_unit;
	}

	public void setDistrict_unit(String district_unit) {
		this.district_unit = district_unit;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfEnlishment_joining() {
		return dateOfEnlishment_joining;
	}

	public void setDateOfEnlishment_joining(LocalDate dateOfEnlishment_joining) {
		this.dateOfEnlishment_joining = dateOfEnlishment_joining;
	}

	public LocalDate getDateOfBecomingConstDriver() {
		return dateOfBecomingConstDriver;
	}

	public void setDateOfBecomingConstDriver(LocalDate dateOfBecomingConstDriver) {
		this.dateOfBecomingConstDriver = dateOfBecomingConstDriver;
	}

	public String getRollVolumes() {
		return rollVolumes;
	}

	public void setRollVolumes(String rollVolumes) {
		this.rollVolumes = rollVolumes;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	} 
	

}
