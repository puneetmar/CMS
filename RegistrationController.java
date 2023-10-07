package com.gitm.collegemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gitm.collegemanagementsystem.entity.Candidate;
import com.gitm.collegemanagementsystem.entity.Course;
import com.gitm.collegemanagementsystem.service.CandidateService;
import com.gitm.collegemanagementsystem.service.CourseService;
@Controller
public class RegistrationController {
    
    @Autowired
    private CourseService courseService;
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/register")
    public String registerCourse(@RequestParam String courseName, @RequestParam double courseFee) {
        // Handle course registration form submission
          Course registeredCourse = courseService.registerCourse(courseName, courseFee);
        // Call courseService.registerCourse() and redirect to a success page
        return "redirect:/success";
    }
    
    @PostMapping("/apply")
    public String applyForCourse(@RequestParam String name, @RequestParam String email) {
        // Handle candidate application form submission
         Candidate appliedCandidate = candidateService.applyForCourse(name, email);
        // Call candidateService.applyForCourse() and redirect to a success page
        return "redirect:/success"; 
    }
}
