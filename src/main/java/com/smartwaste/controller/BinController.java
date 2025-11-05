package com.smartwaste.controller;

import com.smartwaste.model.Bin;
import com.smartwaste.repository.BinRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bins")
@CrossOrigin(origins = "*")
public class BinController {

    private final BinRepository binRepository;

    public BinController(BinRepository binRepository) {
        this.binRepository = binRepository;
    }

    @GetMapping
    public List<Bin> getAllBins() {
        return binRepository.findAll();
    }

    @PostMapping
    public Bin addBin(@RequestBody Bin bin) {
        return binRepository.save(bin);
    }
}