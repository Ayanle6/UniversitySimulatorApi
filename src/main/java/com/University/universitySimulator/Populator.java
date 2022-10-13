package com.University.universitySimulator;

import com.University.universitySimulator.model.Course;
import com.University.universitySimulator.model.Instructor;
import com.University.universitySimulator.repo.CourseRepository;
import com.University.universitySimulator.repo.InstructorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private CourseRepository courseRepo;
    private InstructorRepository instructorRepo;

    public Populator(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Instructor instructor1 = new Instructor("Rickie","CSE");
        instructorRepo.save(instructor1);
        Instructor instructor2 = new Instructor("El","CIS");
        instructorRepo.save(instructor2);
        Instructor instructor3 = new Instructor("Josh","CSE");
        instructorRepo.save(instructor3);



        Course course1 = new Course("Java", 3, 60, "Fall", instructor1);
        courseRepo.save(course1);
        Course course2 = new Course("C#", 3, 60, "Spring",instructor3);
        courseRepo.save(course2);
        Course course3 = new Course("Python", 3, 60, "Summer" , instructor2);
        courseRepo.save(course3);

    }
}
