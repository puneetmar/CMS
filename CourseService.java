package com.cms.collgmangsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.collgmangsystem.entity.Course;
import com.cms.collgmangsystem.repository.CourseRepository;

@Service
public class CourseService {
    

     @Autowired
    private CourseRepository courseRepository;

    public Course enrollCourse(Course course) {
        // Implement course enrollment logic using jdbcTemplate
        return courseRepository.save(course);
    }
}
