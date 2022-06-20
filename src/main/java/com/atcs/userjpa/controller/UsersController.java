package com.atcs.userjpa.controller;

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

import com.atcs.userjpa.Service.UsersService;
import com.atcs.userjpa.ServiceImpl.InvalidEmailException;
import com.atcs.userjpa.ServiceImpl.PasswordFormatException;
import com.atcs.userjpa.entity.*;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersService us;
	
	@GetMapping("/")
	public List<UsersEntity> get(){
		return us.getUser();
	} 
	
	@GetMapping("/{id}")
	public UsersEntity getbyId(@PathVariable long id) {
		return us.getById(id);
	}
	
	@PostMapping("/")
	public List<UsersEntity> post(@RequestBody UsersEntity e) throws InvalidEmailException, PasswordFormatException{
		return us.addUser(e);
	}
	
	@PutMapping("/")
	public List<UsersEntity> put(@RequestBody UsersEntity e) throws InvalidEmailException, PasswordFormatException{
		return us.updateUser(e);
	}
	
	@DeleteMapping("/{id}")
	public List<UsersEntity> delete(@PathVariable long id){
		return us.delteUser(id);
	}
	
}
