package com.xworkz.institute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "instituteinfo")
@Data
@NamedQueries({
		@NamedQuery(name = "findByName", query = "select en from InstituteEntity en where en.instituteName=:iname"),
		@NamedQuery(name = "findAll", query = "select entity from InstituteEntity entity") 
		})
public class InstituteEntity {

	@Id
	@Column(name = "i_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "i_name")
	private String instituteName;
	@Column(name = "i_email")
	private String email;
	@Column(name = "i_contactnumber")
	private String contactNumber;
}
