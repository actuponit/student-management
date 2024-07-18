package com.example.studentmanagement.repositories;

import com.example.studentmanagement.models.StudentCourseInstructor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentCourseInstructorRepository extends CrudRepository<StudentCourseInstructor, String> {

    Iterable<StudentCourseInstructor> findByStudentId(String s);
    Iterable<StudentCourseInstructor> findByCourseId(String s);
    Iterable<StudentCourseInstructor> findByInstructorId(String s);
}
