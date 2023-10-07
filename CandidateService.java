package com.gitm.collegemanagementsystem.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitm.collegemanagementsystem.entity.Candidate;
import com.gitm.collegemanagementsystem.repository.CandidateRepository;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;
    
    public Candidate applyForCourse(String name, String email) {
        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setEmail(email);
        candidate.setApplicationStatus("Pending"); // Set the initial status as 'Pending'
        // Save the candidate to the database
        return candidateRepository.save(candidate);
    }
    
    public String checkApplicationStatus(String email) {
        List<Candidate> candidates = candidateRepository.findByEmail(email);
        if (candidates.isEmpty()) {
            return "No application found for the provided email.";
        }
        Candidate candidate = candidates.get(0);
        return candidate.getApplicationStatus();
    }
    
    // Other candidate-related methods
}
