package com.example.wbdvf19zackmartinserverjava.controllers;
import com.example.wbdvf19zackmartinserverjava.models.Course;
import com.example.wbdvf19zackmartinserverjava.models.Module;
import com.example.wbdvf19zackmartinserverjava.models.Widget;
import com.example.wbdvf19zackmartinserverjava.repositories.CourseRepository;
import com.example.wbdvf19zackmartinserverjava.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ModuleController {

    @Autowired
    ModuleRepository repository;

    @Autowired
    CourseRepository courseRepository;

    // CRUD
    // CREATE   - POST /api/courses/{cid}/modules
    // READ ALL - GET  /api/courses/{cid}/modules - retrieve all courses
    // READ ONE - GET  /api/modules/{mid} - retrieve by id
    // UPDATE   - PUT  /api/modules/{mid} - update course
    // DELETE   - DELETE /api/modules/{mid}

    @GetMapping("/api/modules")
    public List<Module> findAllModules() {
        return repository.findAllModules();
    }

    @GetMapping("/api/courses/{cid}/modules")
    public List<Module> findAllModulesForCourse(
            @PathVariable("cid") Integer courseId) {
        //System.out.println("HERE" + courseId);
        return repository.findAllModulesForCourse(courseId);
    }

    @PostMapping("/api/courses/{cid}/modules")
    public List<Module> createModuleForCourse(
            @PathVariable("cid") Integer courseId,
            @RequestBody Module newModule
    ) {
        Course course = courseRepository.findCourseById(courseId);
        newModule.setCourse(course);
        repository.save(newModule);
        return repository.findAllModulesForCourse(courseId);
    }

    @GetMapping("/api/modules/{mid}")
    public Module findModuleById(@PathVariable("mid") Integer id) {
        return repository.findModuleById(id);
    }

    @DeleteMapping("/api/courses/{cid}/modules/{mid}")
    public List<Module> deleteModule(@PathVariable("mid") Integer id,
                                     @PathVariable("cid") Integer cid) {
        repository.deleteModuleBy(id);
        return repository.findAllModulesForCourse(cid);
    }

    @PutMapping("/api/courses/{cid}/modules/{mid}")
    public List<Module> updateModule(
            @PathVariable("cid") Integer cid,
            @RequestBody Module newModule) {
        Course course = courseRepository.findCourseById(cid);
        newModule.setCourse(course);
        repository.save(newModule);
        return repository.findAllModulesForCourse(cid);
    }
}