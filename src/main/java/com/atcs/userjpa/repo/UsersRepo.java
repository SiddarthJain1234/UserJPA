package com.atcs.userjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.userjpa.entity.UsersEntity;

public interface UsersRepo extends JpaRepository<UsersEntity, Long>{

	
}
