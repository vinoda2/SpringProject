package com.xworkz.events.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="eventInfo")
@Data
public class EventEntity {
	@Id
	private int id;
	private String eventName;
	private String typeOfEvent;
	private String organizarName;
	private String place;


}
