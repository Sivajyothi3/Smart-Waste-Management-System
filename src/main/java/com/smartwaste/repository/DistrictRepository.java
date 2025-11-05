package com.smartwaste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartwaste.model.District;

public interface DistrictRepository extends JpaRepository<District, Long> {}