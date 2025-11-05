package com.smartwaste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartwaste.model.State;

public interface StateRepository extends JpaRepository<State, Long> {}