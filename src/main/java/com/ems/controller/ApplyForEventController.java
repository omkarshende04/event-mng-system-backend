package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.ApplyForEvent;
import com.ems.service.ApplyForEventService;

@RestController
public class ApplyForEventController {

	
	@Autowired
	private ApplyForEventService applyForEventService;
	
	@PostMapping({"/applyforevent"})
	public ApplyForEvent applyForEvent(@RequestBody ApplyForEvent applyForEvent) {
		return applyForEventService.applyForEvent(applyForEvent);
	}
	
	@GetMapping({"/getparticipents"})
	public List<ApplyForEvent> getParticipentsData(){
		return applyForEventService.getParticipentsData();
	}
}
