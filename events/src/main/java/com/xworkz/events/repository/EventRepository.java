package com.xworkz.events.repository;

import com.xworkz.events.dto.EventDTO;
import com.xworkz.events.entity.EventEntity;

public interface EventRepository {
	public boolean saveDTO(EventDTO dto);
	default EventEntity findById(int id) {
		return null;
	}
}
