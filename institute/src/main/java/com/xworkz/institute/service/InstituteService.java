package com.xworkz.institute.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.institute.dto.InstituteDTO;
import com.xworkz.institute.entity.InstituteEntity;

public interface InstituteService<defualt> {

	Set<ConstraintViolation<InstituteEntity>> validateAndSave(InstituteEntity entity);

	Set<ConstraintViolation<InstituteDTO>> updateAndSave(InstituteDTO dto);

	default InstituteDTO findById(int id) {
		return null;
	}

	default List<InstituteDTO> findByName(String instituteName) {
		return Collections.emptyList();
	}

	default List<InstituteDTO> findAll() {
		return Collections.emptyList();
	}

	default InstituteDTO onDelete(int id) {
		return null;
	}
}
