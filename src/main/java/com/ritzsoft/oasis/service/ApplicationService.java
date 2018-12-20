package com.ritzsoft.oasis.service;

import java.util.Set;

import com.ritzsoft.oasis.dto.ApplicationDTO;

public interface ApplicationService {
	public boolean saveApplication(ApplicationDTO appComand);
	
	public ApplicationDTO findApplication(String nationalID);
	
	public Set<ApplicationDTO> findAll();

}
