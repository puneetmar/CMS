package com.gitm.collegemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitm.collegemanagementsystem.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
    // Custom query methods if needed
}