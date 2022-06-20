package com.atcs.userjpa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.userjpa.entity.User_profilesEntity;

@Service
public interface User_profileService {

	public List<User_profilesEntity> getUserProfiles();
	
	public User_profilesEntity getById(long id);
	
	public List<User_profilesEntity> addUserProfile(User_profilesEntity obj);
	
	public List<User_profilesEntity> delteUserProfile(long id);
	
	public List<User_profilesEntity> updateUserProfile(User_profilesEntity obj);

}
