package com.atcs.userjpa.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.userjpa.Service.User_profileService;
import com.atcs.userjpa.entity.User_profilesEntity;
import com.atcs.userjpa.repo.User_profileRepo;

@Component
public class User_profileServiceImple implements User_profileService{

	@Autowired
	User_profileRepo upr;
	
	@Override
	public List<User_profilesEntity> getUserProfiles() {
		return upr.findAll();
	}

	@Override
	public User_profilesEntity getById(long id) {
		
		List<User_profilesEntity> list=upr.findAll();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return list.get(i);
			}
		}
		
		return null;
	}

	@Override
	public List<User_profilesEntity> addUserProfile(User_profilesEntity obj) {
		upr.save(obj);
		return upr.findAll();
	}

	@Override
	public List<User_profilesEntity> delteUserProfile(long id) {
		upr.deleteById(id);
		return upr.findAll();
	}

	@Override
	public List<User_profilesEntity> updateUserProfile(User_profilesEntity obj) {
	upr.save(obj);
	return upr.findAll();
	}

}
