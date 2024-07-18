package com.example.studentmanagement.services;

import com.example.studentmanagement.models.Course;
import com.example.studentmanagement.models.Student;
import com.example.studentmanagement.models.StudentCourseInstructor;
import com.example.studentmanagement.repositories.StudentCourseInstructorRepository;
import com.example.studentmanagement.repositories.StudentRepository;
import lombok.Validate;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentCourseInstructorRepository studentCourseInstructorRepository;

    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Student registerNewStudent(Student student) {
        return studentRepository.save(student);
    }

    public void registerStudentForCourse(@NotNull Student student, @NotNull List<Course> courses) {
        courses.forEach((course) -> studentCourseInstructorRepository.save(new StudentCourseInstructor(student, course, null)));
    }

    public List<StudentCourseInstructor> getAllInformation(String id) {
        return (List<StudentCourseInstructor>)studentCourseInstructorRepository.findByStudentId(id);
    }

}
