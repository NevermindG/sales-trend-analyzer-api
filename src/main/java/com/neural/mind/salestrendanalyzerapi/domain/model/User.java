package com.neural.mind.salestrendanalyzerapi.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	private String id = new ObjectId().toString();
	private String name;
	private int age;
	private String email;
	private String password;
}
