package com.example.studentmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instructor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String name;
    private String gender;

    Instructor(){}
    Instructor(String id, String name, String gender) {
        this();
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
