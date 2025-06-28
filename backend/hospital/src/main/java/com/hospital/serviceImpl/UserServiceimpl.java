package com.hospital.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hospital.dto.request.UserRequest;
import com.hospital.entity.User;
import com.hospital.exception.EmailAlreadyExistsException;
import com.hospital.repository.UserRepository;
import com.hospital.service.UserService;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(UserRequest newUser) {
        // Check if email already exists
        if (userRepository.findByEmail(newUser.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException("Email is already registered.");
        }

        // Build User entity from UserRequest DTO using setters
        User user = new User();
        user.setEmail(newUser.getEmail());
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setRole(newUser.getRole() != null ? newUser.getRole() : "ROLE_USER");
        user.setIsActive(true);

        // Save to DB
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
