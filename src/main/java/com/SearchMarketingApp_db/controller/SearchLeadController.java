package com.SearchMarketingApp_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SearchMarketingApp_db.dto.Lead;

@Controller
public class SearchLeadController {

	@Autowired
	private LeadSearchClient client;

	@RequestMapping("/search")
	public String ViewsearchLeadPage() {
		return "search_leads";

	}

	@RequestMapping(value = "/findLead", method = RequestMethod.POST)
	public String findLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = client.getOneLeadInfo(id);
		model.addAttribute("lead", lead);
		return "lead_info";

	}
}
