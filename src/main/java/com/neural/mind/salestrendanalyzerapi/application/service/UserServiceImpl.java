package com.neural.mind.salestrendanalyzerapi.application.service;

import com.neural.mind.salestrendanalyzerapi.application.dto.UserDTO;
import com.neural.mind.salestrendanalyzerapi.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

	private final User userModel;

	@Autowired
	public UserServiceImpl(User userModel) {
		this.userRepository = userRepository;
	}
	@Override
	public void registerUser(UserDTO userDTO) {

	}
}
