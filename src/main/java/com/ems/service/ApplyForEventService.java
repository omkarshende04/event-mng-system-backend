package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.ApplyForEventDao;
import com.ems.entity.ApplyForEvent;

@Service
public class ApplyForEventService {

	
	@Autowired
	private ApplyForEventDao applyForEventDao;
	
	public ApplyForEvent applyForEvent(ApplyForEvent applyForEvent) {
		return applyForEventDao.save(applyForEvent);
	}
	
	public List<ApplyForEvent> getParticipentsData(){
		return applyForEventDao.findAll();
	}
}
