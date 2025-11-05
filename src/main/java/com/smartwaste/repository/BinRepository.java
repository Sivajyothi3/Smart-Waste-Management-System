package com.smartwaste.repository;

import com.smartwaste.model.Bin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinRepository extends JpaRepository<Bin, Long> {}