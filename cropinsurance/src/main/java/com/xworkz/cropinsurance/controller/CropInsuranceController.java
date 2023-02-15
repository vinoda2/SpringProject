package com.xworkz.cropinsurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CropInsuranceController {

	public CropInsuranceController() {
	  System.out.println("CropInsuranceController");
	}
	@PostMapping("/save")
	public String onSave() {
		System.out.println("on save method is running");
		return "index";
	}
}
