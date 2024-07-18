package com.example.studentmanagement.repositories;

import com.example.studentmanagement.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
