package com.estudos.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
