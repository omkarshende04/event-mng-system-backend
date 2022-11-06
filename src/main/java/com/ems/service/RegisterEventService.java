package com.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.RegisterEventDao;
import com.ems.entity.RegisterEvent;

@Service
public class RegisterEventService {
	
	
	@Autowired
	private RegisterEventDao registerEventDao;

	
	private static List<RegisterEvent> List = new ArrayList<>();


	public RegisterEvent registerEvent(RegisterEvent registerEvent) {
		return registerEventDao.save(registerEvent);
		}
	
	public List<RegisterEvent> getallEvent(){
		return (List<RegisterEvent>) registerEventDao.findAll();
	}
	
	
	public void deleteEventDetails(String eventId) {
		registerEventDao.deleteById(eventId);
	}
	
	public void updateEvent(RegisterEvent registerEvent, String eventId) {
	
		List.stream().map(b->{
			if(b.getEventId() == eventId){
				b.setCertificateType(registerEvent.getCertificateType());
				b.setContact(registerEvent.getContact());
				b.setDate(registerEvent.getDate());
				b.setDepartment(registerEvent.getDepartment());
				b.setDescription(registerEvent.getDescription());
				b.setEventName(registerEvent.getEventName());
				b.setFees(registerEvent.getFees());
				b.setOrganizer(registerEvent.getOrganizer());
				b.setParticipentsLimit(registerEvent.getParticipentsLimit());
				b.setPrize(registerEvent.getPrize());
				b.setTime(registerEvent.getTime());
				b.setType(registerEvent.getType());
				b.setVenue(registerEvent.getVenue());
			}
			return b;
		}).collect(Collectors.toList());
		}
	}
	
	
	


