package com.example.studentmanagement.repositories;

import com.example.studentmanagement.models.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, String> {
}
