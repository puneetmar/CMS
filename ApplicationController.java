package com.gitm.collegemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gitm.collegemanagementsystem.service.CandidateService;

import ch.qos.logback.core.model.Model;

@Controller
public class ApplicationController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/check-status")
    public String checkApplicationStatus(@RequestParam String email, Model model) {
        // Handle checking application status
        String applicationStatus = candidateService.checkApplicationStatus(email);
        model.addAttribute("status", applicationStatus);
        // Display the status in the response or redirect to a status page
        return "status"; // Return the view name for displaying status
    }

}
