package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Course;
import com.example.wbdvf19zackmartinserverjava.services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class CourseController {

    CourseService service = CourseService.getInstance();

    @PostMapping("/api/courses")
    public List<Course> createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }

    @PutMapping("/api/courses/{courseId}")
    public List<Course> updateCourse(
            @PathVariable("courseId") Integer id,
            @RequestBody Course newCourse) {
        return service.updateCourse(id, newCourse);
    }

    @DeleteMapping("/api/courses/{courseId}")
    public List<Course> deleteCourse(@PathVariable("courseId") Integer id) {
        System.out.println("WE ARE HERE " + id);
        return service.deleteCourse(id);
    }

    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return service.findAllCourses();
    }

    @GetMapping("/api/courses/{courseId}")
    public Course findCourseById(@PathVariable("courseId") Integer id) {
        return service.findCourseById(id);
    }


}
