package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Lesson;
import com.example.wbdvf19zackmartinserverjava.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LessonController {
    @Autowired
    LessonRepository repository;
    @GetMapping("/api/modules/{mid}/lessons")
    public List<Lesson> findLessonsForModule(@PathVariable("mid") Integer mid) {
        return this.repository.findAllLessonsForModule(mid);
    }

    @GetMapping("api/lessons/{mid}")
    public Lesson findLessonById(@PathVariable("mid") Integer id) {
        return repository.findLessonById(id);
    }

    @GetMapping("/api/lessons")
    public List<Lesson> findAllLessons() {
        return repository.findAllLessons();
    }


}
