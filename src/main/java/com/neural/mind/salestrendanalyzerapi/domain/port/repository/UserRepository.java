package com.neural.mind.salestrendanalyzerapi.domain.port.repository;

import com.neural.mind.salestrendanalyzerapi.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
	User save(User user);
	Optional<User> findById(String id);
	Optional<User> findByEmail(String email);
	List<User> findAll();
	void deleteById(String id);
	void delete(User user);
}
