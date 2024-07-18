package com.example.studentmanagement;

import com.example.studentmanagement.models.Student;
import com.example.studentmanagement.repositories.StudentRepository;
import com.example.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> allStudents() {
        studentRepository.save(new Student("repo", "male"));
        System.out.println(studentRepository.findAll());
        Student s1 = new Student();
        s1.setName("Imran");
        s1.setGender("Male");

        studentService.registerNewStudent(s1);
//        studentService.registerNewStudent(new Student("Imran", "Male"));
        studentService.registerNewStudent(new Student("Hamza", "Male"));
//        studentService.registerNewStudent(new Student("Feysel", "Female"));
        return studentService.getAllStudents();
    }
}
