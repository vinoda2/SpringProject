package com.xworkz.cropinsurance.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
@Entity
@Table(name="cropdetails")
@Data
public class CropInsuranceDTO {
	@Id
	int id;
	@NotBlank
	@NotEmpty
	@Size(min=2,message="size must be greater then 2")
	private String cropName;
	@NotBlank
	@NotEmpty
	@Size(min=2,message="size must be greater then 2")
	private String cropType;
	@NotBlank
	@NotEmpty
	@Size(min=2,message="size must be greater then 2")
	private String insuranceType;
	@NotBlank
	@NotEmpty
	@Size(min=2,message="size must be greater then 2")
	private String companyName;

}
