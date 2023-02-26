package com.xworkz.events.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.events.dto.EventDTO;
import com.xworkz.events.entity.EventEntity;

public interface EventService {
	Set<ConstraintViolation<EventDTO>> validateAndSave(EventDTO dto);
	default EventDTO findById(int id) {
		return null;
	}

}
