package com.xworkz.institute.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class InstituteDTO {
	private int id;
	@NotBlank
	@NotEmpty
	@Size(min=3,message="Institute name should be more then 3 letters")
	private String instituteName;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	private String contactNumber;
}
