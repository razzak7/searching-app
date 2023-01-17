package com.SearchMarketingApp_db.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.SearchMarketingApp_db.dto.Lead;

@Component
public class LeadSearchClient {

	public Lead getOneLeadInfo(long id) {
		RestTemplate rest = new RestTemplate();
		Lead lead = rest.getForObject("http://localhost:8080/leads/api/get/" + id, Lead.class);
		return lead;

	}

}
