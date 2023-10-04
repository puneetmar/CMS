package com.cms.collgmangsystem.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.collgmangsystem.entity.Student;

@Repository
public class StudentRepository {
     @Autowired
    private JdbcTemplate jdbcTemplate;

    public Student save(Student student) {
        return null;
    }

    public Optional<Student> findById(Long studentId) {
        return null;
    }

    // Implement methods for student data access
    
}
