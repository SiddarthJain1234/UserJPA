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

import com.atcs.userjpa.Service.User_profileService;
import com.atcs.userjpa.entity.User_profilesEntity;

@RestController
@RequestMapping("/userprofiles")
public class User_profilesController {

	@Autowired
	User_profileService e;
	
	@PostMapping("/")
	public List<User_profilesEntity> add(@RequestBody User_profilesEntity usp){
		return e.addUserProfile(usp);
	}
	
	@GetMapping("/")
	public List<User_profilesEntity> get(){
		return e.getUserProfiles();
	}
	
	@GetMapping("/{id}")
	public User_profilesEntity getbyId(@PathVariable long id){
		return e.getById(id);
	}
	
	@DeleteMapping("/{id}")
	public List<User_profilesEntity> delete(@PathVariable long id){
		return e.delteUserProfile(id);
	}
	
	@PutMapping("/")
	public List<User_profilesEntity> update(@RequestBody User_profilesEntity usp ){
		return e.updateUserProfile(usp);
	}
	
}
