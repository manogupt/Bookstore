package com.bridgelabz.Bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.Bookstore.dto.UserDto;
import com.bridgelabz.Bookstore.model.UserModel;
import com.bridgelabz.Bookstore.service.IUserService;

@RestController
@RequestMapping("/user")
public class userControler {
	@Autowired
	IUserService userService;
	
	@PostMapping("/create")
	public UserModel create(@RequestBody UserDto userDto) {
		return userService.create(userDto);
	}
	@GetMapping("/getlist")
	public List<UserModel> getList(){
		return userService.getList();
	}
	@PutMapping("/update/{id}")
	public UserModel update(@RequestBody UserDto userDto , @PathVariable long id) {
		return userService.update(userDto,id);
	}

	@DeleteMapping("/delete/{id}")
	public UserModel delete(@PathVariable long id) {
		return userService.delete(id);
		
	}
}
