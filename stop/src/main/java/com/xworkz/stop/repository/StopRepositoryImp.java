package com.xworkz.stop.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.stop.dto.StopDTO;

@Repository
public class StopRepositoryImp implements StopRepository {

	@Override
	public boolean saveDTO(StopDTO dto) {
		System.out.println("StopRepositoryImp ");
		return false;
	}

}
