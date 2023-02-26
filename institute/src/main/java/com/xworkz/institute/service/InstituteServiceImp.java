package com.xworkz.institute.service;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.entity.InstituteEntity;
import com.xworkz.institute.repository.InstituteRepository;

@Service
public class InstituteServiceImp implements InstituteService {
	@Autowired
	InstituteRepository instituteRepository;

	public InstituteServiceImp() {
		System.out.println("this is InstituteServiceImp");
	}

	@Override
	public Set<ConstraintViolation<InstituteDTO>> validateAndSave(InstituteDTO dto) {
		System.out.println("this is validate method in  service");
		ValidatorFactory valid = Validation.buildDefaultValidatorFactory();
		Validator v = valid.getValidator();
		Set<ConstraintViolation<InstituteDTO>> violation = v.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.err.println("Constraints exists in dto");
			return violation;
		} else {
			System.out.println("violation are not there");
			InstituteEntity entity = new InstituteEntity();
			entity.setInstituteName(dto.getInstituteName());
			entity.setEmail(dto.getEmail());
			entity.setContactNumber(dto.getContactNumber());
			boolean save = this.instituteRepository.saveDTO(entity);
			System.out.println("data saved:" + save);
			System.out.println(entity);
			return Collections.emptySet();
		}
	}

	public InstituteDTO findById(int id) {
		if (id > 0) {
			InstituteEntity entity = this.instituteRepository.findById(id);
			if (entity != null) {
				InstituteDTO dto = new InstituteDTO();
				dto.setInstituteName(entity.getInstituteName());
				dto.setEmail(entity.getEmail());
				dto.setContactNumber(entity.getContactNumber());
				return dto;
			}
		}
		return InstituteService.super.findById(id);
	}

	public InstituteDTO findByName(String instituteName) {
		System.out.println("this is name");
		if (instituteName.equals(null)) {
			InstituteEntity entity = this.instituteRepository.findByName(instituteName);
			System.out.println("this is repo");
			if (entity != null) {
				InstituteDTO dto = new InstituteDTO();
				dto.setInstituteName(entity.getInstituteName());
				dto.setEmail(entity.getEmail());
				dto.setContactNumber(entity.getContactNumber());		
				return dto;
				
			}
		}
		return InstituteService.super.findByName(instituteName);
	}
}
