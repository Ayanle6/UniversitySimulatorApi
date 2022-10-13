package com.University.universitySimulator.controller;

import com.University.universitySimulator.model.Course;
import com.University.universitySimulator.model.Instructor;
import com.University.universitySimulator.repo.InstructorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {
    private InstructorRepository instructorRepo;

    public InstructorController(InstructorRepository instructorRepo) {
        this.instructorRepo = instructorRepo;
    }

    @GetMapping("/courses")
    public Iterable<Instructor> getAllInstructors() {
        return instructorRepo.findAll();
    }

    @GetMapping("/Instructors/{id}")
    public Instructor getSingleInstructors(@PathVariable long id) {
        return instructorRepo.findById(id).get();
    }
}


