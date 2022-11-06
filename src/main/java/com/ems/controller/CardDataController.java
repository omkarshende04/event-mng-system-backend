package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.RegisterEvent;
import com.ems.service.CardDataService;

@RestController
public class CardDataController {

	
	@Autowired
	private CardDataService cardDataService;
	
	public List<RegisterEvent> cardData(){
		return cardDataService.cardData();
	}
}
