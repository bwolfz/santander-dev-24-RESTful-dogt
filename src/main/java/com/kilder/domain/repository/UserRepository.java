package com.kilder.domain.repository;

import com.kilder.domain.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Trainer, Integer> {
}
