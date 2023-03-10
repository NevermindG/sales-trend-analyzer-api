package com.neural.mind.salestrendanalyzerapi.infrastructure.persistance.mongodb.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {

	@Id
	private String id = new ObjectId().toString();
	private String name;
	private int age;
	private String email;
	private String password;
}
