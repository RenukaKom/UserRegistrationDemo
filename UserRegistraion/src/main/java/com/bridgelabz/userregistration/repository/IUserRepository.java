package com.bridgelabz.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.userregistration.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

}
