package com.neural.mind.salestrendanalyzerapi.infrastructure.adapter.out;

import com.neural.mind.salestrendanalyzerapi.domain.model.User;
import com.neural.mind.salestrendanalyzerapi.domain.port.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserMongoRepository implements UserRepository {

	private final UserRepository userRepository;

	public UserMongoRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
}
