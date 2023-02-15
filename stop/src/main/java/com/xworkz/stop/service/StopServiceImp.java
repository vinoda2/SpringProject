package com.xworkz.stop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.stop.dto.StopDTO;
import com.xworkz.stop.repository.StopRepository;

@Service
public class StopServiceImp implements StopService {
	@Autowired
	private StopRepository repo;
	
	@Override
	public boolean validateAndSave(StopDTO dto) {
		System.out.println("Running validateAndSave");
		boolean save=this.repo.saveDTO(dto);
		System.out.println("saving data:"+save);
		return false;
	}

}
