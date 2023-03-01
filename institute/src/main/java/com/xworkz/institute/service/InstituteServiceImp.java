package com.xworkz.institute.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
			entity.setId(dto.getId());
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
		return null;
	}

	public List<InstituteDTO> findByName(String instituteName) {
		if (instituteName != null)
			try {
				List<InstituteDTO> list = new ArrayList<>();
				List<InstituteEntity> entities = this.instituteRepository.findByName(instituteName);
				for (InstituteEntity entity : entities) {
					InstituteDTO dto = new InstituteDTO();
					dto.setInstituteName(entity.getInstituteName());
					dto.setEmail(entity.getEmail());
					dto.setContactNumber(entity.getContactNumber());
					dto.setId(entity.getId());
					list.add(dto);
				}
				System.out.println("list count:" + list.size());
				return list;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public Set<ConstraintViolation<InstituteDTO>> updateAndSave(InstituteDTO dto) {
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
			boolean save = this.instituteRepository.updateDTO(entity);
			System.out.println("data saved:" + save);
			System.out.println(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public InstituteDTO onDelete(int id) {
	InstituteEntity entity=this.instituteRepository.onDelete(id);
	if(entity!=null) {
		InstituteDTO dto = new InstituteDTO();
		dto.setId(entity.getId());
		dto.setInstituteName(entity.getInstituteName());
		dto.setEmail(entity.getEmail());
		dto.setContactNumber(entity.getContactNumber());
		return dto;
	}
		return InstituteService.super.onDelete(id);
	}
}
