package com.neural.mind.salestrendanalyzerapi.application.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	@NotEmpty(message = "{user.name.notEmpty}")
	private String name;

	@NotEmpty(message = "{user.lastName.notEmpty}")
	private String lastName;
	@Min(value = 18, message = "{user.age.min}")
	private int age;
	@NotEmpty(message = "{user.email.notEmpty}")
	@Email(message = "{user.email.invalid}")
	private String email;

	@NotEmpty(message = "{user.password.notEmpty}")
	@Min(value = 6, message = "{user.password.size}")
	@Pattern(regexp = "^(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).+$", message = "{user.password.pattern}")
	private String password;
}
