package com.bridgelabz.Bookstore.service;

import java.util.List;

import com.bridgelabz.Bookstore.dto.UserDto;
import com.bridgelabz.Bookstore.model.UserModel;

public interface IUserService {
	UserModel create(UserDto userDto);

	List<UserModel> getList();
	
	UserModel update(UserDto userDto, long id);

	UserModel delete(long id);

	

}
