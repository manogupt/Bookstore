package com.bridgelabz.Bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.Bookstore.Repository.IUserRepository;
import com.bridgelabz.Bookstore.dto.UserDto;
import com.bridgelabz.Bookstore.model.UserModel;

@Service
public class UserService implements IUserService{
	
	@Autowired
	IUserRepository userRepo;
	
 @Override
	public UserModel create(UserDto userDto) {
		UserModel user = new UserModel(userDto); 
		userRepo.save(user);
		return user;
	}
	@Override
	public List<UserModel> getList() {
		List<UserModel> list = userRepo.findAll();
		return list;
	}

	@Override
	public UserModel update(UserDto userDto , long id) {
		Optional<UserModel> user = userRepo.findById(id);
		user.get().setFirstName(userDto.getFirstName());
		user.get().setLastName(userDto.getLastName());
		user.get().setKyc(userDto.getKyc());
		user.get().setDob(userDto.getDob());
		user.get().setPassword(userDto.getPassword());
		user.get().setEmail(userDto.getEmail());
		user.get().setPurchaseDate(userDto.getPurchaseDate());
		user.get().setExpiryDate(userDto.getExpiryDate());
		userRepo.save(user.get());
		return user.get();
	}

	@Override
	public UserModel delete(long id) {
		Optional<UserModel> user = userRepo.findById(id);
		userRepo.delete(user.get());
		return user.get();
	}
}