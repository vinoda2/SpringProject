package com.xworkz.institute.repository;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.institute.entity.InstituteEntity;

public interface InstituteRepository {

	Set<ConstraintViolation<InstituteEntity>> saveDTO(InstituteEntity entity);

	boolean updateDTO(InstituteEntity entity);

	default InstituteEntity findById(int id) {
		return null;
	}
	default List<InstituteEntity> findByName(String instituteName) {
		return Collections.emptyList();
	}
	default List<InstituteEntity> findAll() {
		return Collections.emptyList();
	}
	default InstituteEntity onDelete(int id) {
		return null;
	}
}
