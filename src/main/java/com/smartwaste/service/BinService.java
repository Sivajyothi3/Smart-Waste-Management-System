package com.smartwaste.service;

import com.smartwaste.model.Bin;
import com.smartwaste.repository.BinRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BinService {

    private final BinRepository binRepository;

    public BinService(BinRepository binRepository) {
        this.binRepository = binRepository;
    }

    public List<Bin> getAllBins() {
        return binRepository.findAll();
    }

    public Optional<Bin> getBinById(Long id) {
        return binRepository.findById(id);
    }

    public Bin addBin(Bin bin) {
        return binRepository.save(bin);
    }

    public void deleteBin(Long id) {
        binRepository.deleteById(id);
    }
}