package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/leadpage3")
	public String createLeadPage() {
		return"create_lead";
	}
	
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead Saved!!");
		return "create_lead";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id,ModelMap model) {
		
		leadService.deleteById(id);
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
	}
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
