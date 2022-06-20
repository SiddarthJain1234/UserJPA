package com.atcs.userjpa.ServiceImpl;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.userjpa.Service.UsersService;
import com.atcs.userjpa.entity.User_profilesEntity;
import com.atcs.userjpa.entity.UsersEntity;
import com.atcs.userjpa.repo.UsersRepo;

@Component
public class UserServiceImpl implements UsersService {

	@Autowired
	UsersRepo uprs;
	
	@Override
	public List<UsersEntity> getUser() {
		return uprs.findAll();
	}

	@Override
	public UsersEntity getById(long id) {
		List<UsersEntity> list=uprs.findAll();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return list.get(i);
			}
		}
		
		return null;
	}

	
	//bl
	@Override
	public List<UsersEntity> addUser(UsersEntity obj) throws InvalidEmailException, PasswordFormatException {
		
		String password=obj.getPassword();
		String email=obj.getEmail();
		
		 
		
		if(checkEmail(email)==false)
			throw new InvalidEmailException();
		
		
		if(checkPassword(password)==false)
			throw new PasswordFormatException();
		
		if(checkEmail(email) && checkPassword(password))
			uprs.save(obj);
		
		
		
		return uprs.findAll();
		
	}

	private boolean checkEmail(String email) {
		String emailRegex ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				
 Pattern pat = Pattern.compile(emailRegex); 
  if (email == null)
   return false;
   return pat.matcher(email).matches();
	}

	private boolean checkPassword(String password) {
		String passRegex="^(?=.*[@$!%*#?&])(?=.*[a-zA-Z]).{10,}$";
		
				Pattern pat = Pattern.compile(passRegex); 
		  if (password == null)
		   return false;
		   return pat.matcher(password).matches();			
				
	}

	@Override
	public List<UsersEntity> delteUser(long id) {
		uprs.deleteById(id);
		return uprs.findAll();
	}

	
	
	//bl
	@Override
	public List<UsersEntity> updateUser(UsersEntity obj) throws InvalidEmailException, PasswordFormatException {
		String password=obj.getPassword();
		String email=obj.getEmail();
		
		 
		
		if(checkEmail(email)==false)
			throw new InvalidEmailException();
		
		
		if(checkPassword(password)==false)
			throw new PasswordFormatException();
		
		if(checkEmail(email) && checkPassword(password))
			uprs.save(obj);
		
		
		
		return uprs.findAll();
	}

}
