package com.xworkz.institute.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.entity.InstituteEntity;
import com.xworkz.institute.service.InstituteService;

@Controller
@RequestMapping("/")
public class InstituteController {
	@Autowired
	InstituteService instituteService;

	List<String> instituteList = Arrays.asList("Xworkz", "Jspider", "Pentagan", "Qspider", "Besent");
	List<String> location = Arrays.asList("Rajajinager", "vijayanagara", "BTM", "bhashyam circle");

	public InstituteController() {
		System.out.println("InstituteController running ----");
	}

	@GetMapping("/register")
	public String onUpdate(Model model) {
		model.addAttribute("instituteList", instituteList);
		model.addAttribute("location", location);
		return "Registration";
	}

	@PostMapping("/register")
	public String onSave(InstituteDTO dto, Model model) {
		System.out.println("this is onSave method ");
		Set<ConstraintViolation<InstituteDTO>> violation = this.instituteService.validateAndSave(dto);
		if (violation != null) {
			System.err.println(" Errors");
			return "Registration";
		}else {
		model.addAttribute("instituteList", instituteList);
		model.addAttribute("location", location);
		model.addAttribute("errors", violation);
		model.addAttribute("entity", dto);
		System.out.println("entity:" + dto);
		return "Success";
		}
	}

	@PostMapping("/searchId")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("on Search method");
		InstituteDTO dto = this.instituteService.findById(id);
		if (dto != null) {
			model.addAttribute("dtos", dto);
		} else {

			model.addAttribute("message", "Date not found");
		}
		return "SearchCourse";
	}

	@PostMapping("/searchName")
	public String onSearch(@RequestParam String instituteName, Model model) {
		System.out.println("on Search method");
		System.out.println(instituteName);
		List<InstituteDTO> dtos = this.instituteService.findByName(instituteName);
		System.out.println(dtos);
		if (dtos != null) {
			model.addAttribute("dto", dtos);
		} else {
			model.addAttribute("message", "Date not found");
		}
		return "SearchByName";
	}

	@PostMapping("/findAll")
	public String onFind(Model model) {
		System.out.println("Find All method");
		List<InstituteDTO> dtolist = this.instituteService.findAll();
		System.out.println(dtolist.toString());
		if (dtolist != null) {
			model.addAttribute("dtolist", dtolist);
		} else {
			model.addAttribute("message", "Date not found");
		}
		return "FindAll";
	}

	@GetMapping("/update")
	public String update(Model model, @RequestParam int id) {
		System.out.println("Running in update get method");
		InstituteDTO institutedtos = this.instituteService.findById(id);
		model.addAttribute("dtos", institutedtos);
		// model.addAttribute("type", type);
		return "UpdateDetails";
	}
	
	@PostMapping("/update")
	public String onUpdate(InstituteDTO dto, Model model) {
		System.out.println("this is on update method");
		Set<ConstraintViolation<InstituteDTO>> violation = this.instituteService.updateAndSave(dto);
		if (violation.size()>0) {
			model.addAttribute("errors", violation);
		}else {
		model.addAttribute("message","institute details updated successfully");
		}
		return "UpdateDetails";
	}

	@GetMapping("/delete")
	public String onDelete(Model model, @RequestParam int id) {
		InstituteDTO dto = this.instituteService.onDelete(id);
		model.addAttribute("message", "data deleted");
		return "SearchByName";
	}
}
