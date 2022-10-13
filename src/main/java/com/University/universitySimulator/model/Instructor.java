package com.University.universitySimulator.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Instructor {
    @Id
    @GeneratedValue
    private long id;
    private String InstructorName;
    private String department;

    @OneToMany(mappedBy = "instructor")
    private Instructor instructor;



    public Instructor(String instructorName, String department) {
        this.InstructorName = instructorName;
        this.department = department;
    }
    public Instructor() {

    }

    public String getInstructorName() {
        return InstructorName;
    }

    public String getDepartment() {
        return department;
    }

    public Collection<Course> getCourses() {
        return Courses;
    }
}
