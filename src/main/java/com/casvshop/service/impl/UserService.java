package com.casvshop.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casvshop.model.dto.UserDto;
import com.casvshop.model.entity.User;
import com.casvshop.repository.RoleRepository;
import com.casvshop.repository.UserRepository;
import com.casvshop.service.IUserService;
@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User registerNewUserAccount(UserDto userDto) {
		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setEmail(userDto.getEmail());
		user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
		return userRepository.save(user);
	}

}
