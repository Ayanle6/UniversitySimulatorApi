package com.University.universitySimulator.repo;


import com.University.universitySimulator.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
