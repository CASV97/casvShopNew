package com.casvshop.service;

import com.casvshop.model.dto.UserDto;
import com.casvshop.model.entity.User;

public interface IUserService {
	public abstract User registerNewUserAccount(UserDto userDto);
}
