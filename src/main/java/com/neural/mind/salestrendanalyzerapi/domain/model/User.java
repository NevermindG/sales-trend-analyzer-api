package com.neural.mind.salestrendanalyzerapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String id;
	private String name;
	private int age;
	private String email;
	private String password;
}
