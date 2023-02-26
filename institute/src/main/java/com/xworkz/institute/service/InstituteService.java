package com.xworkz.institute.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.institute.dto.InstituteDTO;

public interface InstituteService {
	public abstract Set<ConstraintViolation<InstituteDTO>> validateAndSave(InstituteDTO dto);
	
	default InstituteDTO findById(int id) {
		return null;
	}
	default InstituteDTO findByName(String instituteName) {
		return null;
	}
}
