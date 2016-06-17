package com.springbootsecure.repository;

import com.springbootsecure.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository< User, String>{
  
  public User findByUsername(String username); 
}