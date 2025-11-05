package com.smartwaste.controller;

import com.smartwaste.model.District;
import com.smartwaste.repository.DistrictRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/districts")
@CrossOrigin(origins = "*")
public class DistrictController {

    private final DistrictRepository districtRepository;

    public DistrictController(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @GetMapping
    public List<District> getAllDistricts() {
        return districtRepository.findAll();
    }
}