package com.xworkz.cropinsurance.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cropinsurance.dto.CropInsuranceDTO;
import com.xworkz.cropinsurance.service.CropInsuranceService;

@Controller
@RequestMapping("/")
public class CropInsuranceController {
	
	@Autowired
	private CropInsuranceService cropInsuranceService;
	
	public CropInsuranceController() {
	  System.out.println("CropInsuranceController");
	}
	@PostMapping("/save")
	public String onSave(CropInsuranceDTO dto,Model model) {
		System.out.println("on save method is running");
		model.addAttribute(dto);
		System.out.println(dto);
	Set<ConstraintViolation<CropInsuranceDTO>> violation=this.cropInsuranceService.validateAndSave(dto);
		return "index";
	}
}
