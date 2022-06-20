package com.atcs.userjpa.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.userjpa.ServiceImpl.InvalidEmailException;
import com.atcs.userjpa.ServiceImpl.PasswordFormatException;
import com.atcs.userjpa.entity.UsersEntity;

@Service
public interface UsersService {
	public List<UsersEntity> getUser();

	public UsersEntity getById(long id);
	
	public List<UsersEntity> addUser(UsersEntity obj) throws InvalidEmailException,PasswordFormatException;
	
	public List<UsersEntity> delteUser(long id);
	
	public List<UsersEntity> updateUser(UsersEntity obj)throws InvalidEmailException,PasswordFormatException;

	
	
}
