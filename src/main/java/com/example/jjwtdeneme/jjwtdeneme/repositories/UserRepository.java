package com.example.jjwtdeneme.jjwtdeneme.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jjwtdeneme.jjwtdeneme.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmail(String email);
  
}
