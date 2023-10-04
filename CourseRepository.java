package com.cms.collgmangsystem.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.collgmangsystem.entity.Course;

@Repository
public class CourseRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    public Course save(Course course) {
        return null;
    }


    // Implement methods for course data access
    
}
