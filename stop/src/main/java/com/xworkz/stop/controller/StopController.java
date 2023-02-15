package com.xworkz.stop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.stop.dto.StopDTO;
import com.xworkz.stop.service.StopService;

@Controller
@RequestMapping("/")
public class StopController {
	
	@Autowired
	private StopService stopservice;
	

	public StopController() {
	System.out.println("this is StopController");
	}
	@PostMapping("/send")
	public String onClick(StopDTO dto,Model model) {
	 System.out.println("dto:"+dto);
	 model.addAttribute("start",dto.getStart());
	 model.addAttribute("end"+dto.getEnd());
	 boolean valid=this.stopservice.validateAndSave(dto);
	 System.out.println(valid+"validating data");
	 return "Success";
	}
	
}
