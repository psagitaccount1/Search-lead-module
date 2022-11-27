package com.marketing.service;

import java.util.List;

import com.marketing.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public List<Lead> listLeads();

	public void deleteById(long id);

	public Lead getOneLead(long id);

}
