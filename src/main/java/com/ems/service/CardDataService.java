package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.CardDataDao;
import com.ems.entity.RegisterEvent;

@Service
public class CardDataService {
	
	
	@Autowired
	private CardDataDao cardDataDao;
	
	
	public List<RegisterEvent> cardData(){
		return cardDataDao.findAll();
	}

}
