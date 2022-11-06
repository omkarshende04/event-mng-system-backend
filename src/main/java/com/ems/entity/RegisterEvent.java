package com.ems.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RegisterEvent")
public class RegisterEvent {
	
	@Id
	private String eventId;
	private String eventName;
	private String description;
	private String department;
	private String organizer;
	private String date;
	private String venue;
	private String contact;
	private String time;
	private String participentsLimit;
	private String certificateType;
	private String type;
	private String fees;
	private String prize;
	
	
	public RegisterEvent() {

	}
	
	
	public RegisterEvent(String eventId, String eventName, String description, String department, String organizer,
			String date, String venue, String contact, String time, String participentsLimit, String certificateType,
			String type, String fees, String prize) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.description = description;
		this.department = department;
		this.organizer = organizer;
		this.date = date;
		this.venue = venue;
		this.contact = contact;
		this.time = time;
		this.participentsLimit = participentsLimit;
		this.certificateType = certificateType;
		this.type = type;
		this.fees = fees;
		this.prize = prize;
	}
	
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getParticipentsLimit() {
		return participentsLimit;
	}
	public void setParticipentsLimit(String participentsLimit) {
		this.participentsLimit = participentsLimit;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	

}
