package com.gitm.collegemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitm.collegemanagementsystem.entity.Course;
import com.gitm.collegemanagementsystem.repository.CourseRepository;

@Service
public class CourseService {
    
     @Autowired
    private CourseRepository courseRepository;
    
    public Course registerCourse(String courseName, double courseFee) {
        Course course = new Course();
        course.setName(courseName);
        course.setFee(courseFee);
        // Save the course to the database
        return courseRepository.save(course);
    }
    
    // Other course-related methods
}

