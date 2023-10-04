package com.cms.collgmangsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.collgmangsystem.entity.Student;
import com.cms.collgmangsystem.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

      @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        Student registeredStudent = studentService.registerStudent(student);
        return ResponseEntity.ok(registeredStudent);
    }

    @GetMapping("/{studentId}/application-status")
    public ResponseEntity<Student> checkApplicationStatus(@PathVariable Long studentId) {
        Student student = studentService.checkApplicationStatus(studentId);
        return ResponseEntity.ok(student);
    }
    
}
