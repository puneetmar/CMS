package com.cms.collgmangsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.collgmangsystem.entity.Student;
import com.cms.collgmangsystem.repository.StudentRepository;

@Service
public class StudentService {

      @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        // Implement student registration logic using jdbcTemplate
        return studentRepository.save(student);
    }

    public Student checkApplicationStatus(Long studentId) {
        // Implement logic to retrieve and return the application status for a student
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
         //   throw new NotFoundException("Student not found with ID: " + studentId);
        }
        return null;
    }
    
}
