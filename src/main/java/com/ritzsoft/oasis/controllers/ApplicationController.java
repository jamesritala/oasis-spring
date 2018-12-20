package com.ritzsoft.oasis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ritzsoft.oasis.dto.ApplicationDTO;

@Controller
public class ApplicationController {

	@GetMapping({"/","index","index.html"})
	public String getHomePage(Model model) {
		model.addAttribute("application", new ApplicationDTO());
		return "index";
	}
	
	@PostMapping("/applications/save")
	public String saveApplication(ApplicationDTO appDto, BindingResult result) {
		
		return "result";
		
	}
}
