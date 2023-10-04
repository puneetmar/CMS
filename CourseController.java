package com.cms.collgmangsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.collgmangsystem.entity.Course;
import com.cms.collgmangsystem.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/enroll")
    public ResponseEntity<Course> enrollCourse(@RequestBody Course course) {
        Course enrolledCourse = courseService.enrollCourse(course);
        return ResponseEntity.ok(enrolledCourse);
    }
    
}
