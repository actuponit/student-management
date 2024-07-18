package com.example.studentmanagement.models;

import jakarta.persistence.*;

@Entity
public class StudentCourseInstructor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Instructor instructor;
    float grade;

    public StudentCourseInstructor() {}
    public StudentCourseInstructor(Student student, Course course, Instructor instructor) {
        this.student = student;
        this.course = course;
        this.instructor = instructor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
  }

}
