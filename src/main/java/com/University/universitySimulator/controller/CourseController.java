package com.University.universitySimulator.controller;

import com.University.universitySimulator.model.Course;
import com.University.universitySimulator.repo.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private CourseRepository courseRepo;

    public CourseController(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    @GetMapping("/courses")
    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }
    @GetMapping("/courses/{id}")
    public Course getSingleCourse(@PathVariable long id) {
        return courseRepo.findById(id).get();

    }

}


