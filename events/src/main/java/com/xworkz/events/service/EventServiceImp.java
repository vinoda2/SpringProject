package com.xworkz.events.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.events.dto.EventDTO;
import com.xworkz.events.entity.EventEntity;
import com.xworkz.events.repository.EventRepository;

@Service
public class EventServiceImp implements EventService {

	@Autowired
	EventRepository eventRepository;

	@Override
	public Set<ConstraintViolation<EventDTO>> validateAndSave(EventDTO dto) {
		ValidatorFactory valid = Validation.buildDefaultValidatorFactory();
		Validator v = valid.getValidator();
		Set<ConstraintViolation<EventDTO>> violation = v.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.out.println("Constraints exists");
			return violation;
		} else {
			System.out.println("violation are not there");
			EventEntity event = new EventEntity();
			event.setEventName(dto.getEventName());
			event.setTypeOfEvent(dto.getTypeOfEvent());
			event.setOrganizarName(dto.getOrganizarName());
		//	event.setDate(dto.getDate());
			return Collections.emptySet();
		}
	}
	public EventDTO findById(int id) {
		if(id>0) {
			EventEntity entity=this.eventRepository.findById(id);
			if(entity!=null) {
				EventDTO dto = new EventDTO();
				dto.setEventName(entity.getEventName());;
				dto.setTypeOfEvent(entity.getTypeOfEvent());
				dto.setOrganizarName(entity.getOrganizarName());
				dto.setPlace(entity.getPlace());
				return dto;
			}
		}
		return EventService.super.findById(id);
	}

}
