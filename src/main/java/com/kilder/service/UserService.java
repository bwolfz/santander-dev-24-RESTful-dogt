package com.kilder.service;

import com.kilder.domain.model.Trainer;

public interface UserService {

    Trainer fingById(int id);

    Trainer create(Trainer trainerToCreate);
}
