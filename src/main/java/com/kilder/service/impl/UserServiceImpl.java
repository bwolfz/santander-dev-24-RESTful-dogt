package com.kilder.service.impl;

import com.kilder.domain.model.Trainer;
import com.kilder.domain.repository.UserRepository;
import com.kilder.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Trainer fingById(int id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Trainer create(Trainer trainerToCreate) {
        if (userRepository.existsById(trainerToCreate.getId())){
            throw  new IllegalArgumentException("This ID already exists");
        }
        return userRepository.save(trainerToCreate);
    }
}
