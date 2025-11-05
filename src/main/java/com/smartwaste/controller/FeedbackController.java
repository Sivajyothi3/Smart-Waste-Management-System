package com.smartwaste.controller;

import com.smartwaste.model.Feedback;
import com.smartwaste.repository.FeedbackRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    private final FeedbackRepository feedbackRepository;

    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    // Fetch all feedback entries
    @GetMapping
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    // Save a new feedback from the frontend
    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}