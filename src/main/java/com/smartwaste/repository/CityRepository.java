package com.smartwaste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartwaste.model.City;

public interface CityRepository extends JpaRepository<City, Long> {}