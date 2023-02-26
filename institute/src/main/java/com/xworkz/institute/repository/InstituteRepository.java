package com.xworkz.institute.repository;

import com.xworkz.institute.entity.InstituteEntity;

public interface InstituteRepository {

	boolean saveDTO(InstituteEntity entity);

	default InstituteEntity findById(int id) {
		return null;
	}

	default InstituteEntity findByName(String instituteName) {
		return null;
	}
}
