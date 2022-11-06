package com.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userInfo")
public class ApplyForEvent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	private String department;
	private String address;
	private String contact;
	private String eventId;
	private String alternateContactNumber;
	private String collegeName;
	private String universityName;
	private String yearOfStudy;
	
	
	public ApplyForEvent() {
	
	}
	
	
	public ApplyForEvent(Long userId, String department, String address, String contact, String eventId,
			String alternateContactNumber, String collegeName, String universityName, String yearOfStudy) {
		super();
		this.userId = userId;
		this.department = department;
		this.address = address;
		this.contact = contact;
		this.eventId = eventId;
		this.alternateContactNumber = alternateContactNumber;
		this.collegeName = collegeName;
		this.universityName = universityName;
		this.yearOfStudy = yearOfStudy;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}
	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	
	
}


