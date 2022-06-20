package com.atcs.userjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.userjpa.entity.User_profilesEntity;

@Repository
public interface User_profileRepo extends JpaRepository<User_profilesEntity, Long>{

}
