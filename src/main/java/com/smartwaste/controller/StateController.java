package com.smartwaste.controller;

import com.smartwaste.model.State;
import com.smartwaste.repository.StateRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/states")
@CrossOrigin(origins = "*")
public class StateController {

    private final StateRepository stateRepository;

    public StateController(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @GetMapping
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }
}