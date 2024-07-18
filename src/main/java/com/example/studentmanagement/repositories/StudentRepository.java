package com.example.studentmanagement.repositories;


import com.example.studentmanagement.models.Student;
import org.springframework.data.repository.ListCrudRepository;

public interface StudentRepository extends ListCrudRepository<Student, String> {

}
