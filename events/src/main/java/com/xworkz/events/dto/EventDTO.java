package com.xworkz.events.dto;

import java.util.Date;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EventDTO {
	@NotBlank
	@NotEmpty
	@Size(min=3,max=20, message="enter the correct event name")
	private String eventName;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=20, message="enter the correct event name")
	private String typeOfEvent;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=20, message="enter the correct event name")
	private String organizarName;
	private String place;

}
