package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.Lead;
import com.marketing.service.LeadService;

@RestController
@RequestMapping("/api/leads2")
public class LeadRestController2 {
	
	@Autowired
	private LeadService leadService;
	
	//Handler Methods
	
	//getting all leads
	@GetMapping
	public List<Lead> getAllLeads(){
	List<Lead> leads = leadService.listLeads();
	return leads;
	}
	
	//creating new data
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
	}
	
	//deleting data
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id") long id) {
		leadService.deleteById(id);
	}
	
	//updating/modifying data
	@PutMapping
	public void updateOneLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
	}
	
	//getting lead data by id(ye url dusre team ko dedenge wo log apne id number daal ke data json k
	//form me lekr usko dto class se java object me badal k consume kr lenge)
	@GetMapping("/lead/{id}") //localhost:8080/api/leads2/lead/3
	public Lead getOneLead(@PathVariable("id") long id) {
		Lead lead = leadService.getOneLead(id);
		return lead;
	}
	
	
	
	
	
}
