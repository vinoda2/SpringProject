package com.xworkz.institute.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.service.InstituteService;

@Controller
@RequestMapping("/")
public class InstituteController {
	@Autowired
	InstituteService instituteService;

	public InstituteController() {
		System.out.println("InstituteController running ----");
	}

	@PostMapping("/register")
	public String onSave(InstituteDTO dto, Model model) {
		System.out.println("this is onSave method ");
		Set<ConstraintViolation<InstituteDTO>> violation = this.instituteService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println("No errors");
			return "Success";
		}
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		System.out.println("dto:" + dto);
		return "Registration";
	}
	
	@PostMapping("/searchId")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("on Search method");
		InstituteDTO dto=this.instituteService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Date not found");
		}
		return "SearchCourse";
	}
	
	@PostMapping("/searchName")
	public String onSearch(@RequestParam String instituteName,Model model) {
		System.out.println("on Search method");
		System.out.println(instituteName);
		InstituteDTO dto=this.instituteService.findByName(instituteName);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Date not found");
		}
		return "SearchCourse";
	}

	@PostMapping("/course")
	public String courseSave(CourseDTO dto, Model model) {
		System.out.println("this is Course method");
		System.out.println("Course Details:" + dto);
		return "Course";
	}
}
