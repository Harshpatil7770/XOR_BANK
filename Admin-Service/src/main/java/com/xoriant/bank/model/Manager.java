package com.xoriant.bank.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long managerId;

	@Pattern(regexp = "^[A-Za-z ]*$")
	@Size(min = 1, max = 30, message = "Please enter your first name")
	@NotBlank
	private String firstName;

	@Pattern(regexp = "^[A-Za-z ]*$")
	@Size(min = 1, max = 30, message = "Please enter your last name")
	@NotBlank
	private String lastName;

	@NotNull(message = "Please enter user name")
	private String userName;

	// ----------- Minimun 8 character, atleast 1 letter and 1 number ----------//
	// @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
	private String password;

	@NotBlank(message = "Please enter user type")
	private String userType;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Address address;

	private long branchId;
}
