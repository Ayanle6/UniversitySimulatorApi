package com.University.universitySimulator.repo;

import com.University.universitySimulator.model.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
