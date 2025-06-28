package com.hospital.service;

import java.util.Optional;

import com.hospital.entity.User;

public interface UserService 
{

	Optional<User> findByEmail(String email);

	User createUser(Object email, Object password, String string);

}
