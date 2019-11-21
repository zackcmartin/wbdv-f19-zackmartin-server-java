package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Course;
import com.example.wbdvf19zackmartinserverjava.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "https://wbdv-f19-zmartin-client-react.herokuapp.com")
public class CourseController {

    @Autowired
    CourseRepository repository;

    @PostMapping("/api/courses")
    public List<Course> createCourse(@RequestBody Course course) {
        repository.save(course);
        return repository.findAllCourses();
    }

    @PutMapping("/api/courses/{courseId}")
    public List<Course> updateCourse(
            @RequestBody Course newCourse) {
        repository.save(newCourse);
        return repository.findAllCourses();
    }

    @DeleteMapping("/api/courses/{courseId}")
    public List<Course> deleteCourse(@PathVariable("courseId") Integer id) {
        repository.deleteCourseBy(id);
        return repository.findAllCourses();
    }

    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return repository.findAllCourses();
    }

    @GetMapping("/api/courses/{courseId}")
    public Course findCourseById(@PathVariable("courseId") Integer id) {
        return repository.findCourseById(id);
    }

    // createWidget
    // findAllWidgets
    // findWidgetById
    // updateWidget
    // deleteWidget

}