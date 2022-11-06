package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.RegisterEvent;
import com.ems.service.CardDataService;
import com.ems.service.RegisterEventService;

@RestController
public class RegisterEventController {
	
	
	@Autowired
	private RegisterEventService registerEventService;
	

	@PostMapping({"/registerEvent"})
	public RegisterEvent registerEvent(@RequestBody RegisterEvent registerEvent) {
		return registerEventService.registerEvent(registerEvent);
	}
	
	@GetMapping({"/getallevents"})
	public List<RegisterEvent> getAllevents(){
		return registerEventService.getallEvent();
	}
	
	@DeleteMapping({"/deleteEventDetails/{eventId}"})
	public void deleteEventDetails(@PathVariable("eventId") String eventid) {
		registerEventService.deleteEventDetails(eventid);
	}

	
	@PutMapping({"/updateEvent/{eventId}"})
	public RegisterEvent updateEvent(@RequestBody RegisterEvent registerEvent, @PathVariable String eventid) {
		this.registerEventService.updateEvent(registerEvent, eventid);
		return registerEvent;
	}
}
