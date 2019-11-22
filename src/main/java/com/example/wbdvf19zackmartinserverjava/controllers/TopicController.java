package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Lesson;
import com.example.wbdvf19zackmartinserverjava.models.Topic;
import com.example.wbdvf19zackmartinserverjava.repositories.LessonRepository;
import com.example.wbdvf19zackmartinserverjava.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TopicController {
    @Autowired
    TopicRepository repository;
    @GetMapping("/api/lessons/{lid}/topics")
    public List<Topic> findTopicsForLesson(@PathVariable("lid") Integer lid) {
        return this.repository.findAllTopicsForLesson(lid);
    }

    @GetMapping("api/topic/{tid}")
    public Topic findTopicById(@PathVariable("tid") Integer id) {
        return repository.findTopicById(id);
    }

    @GetMapping("/api/topics")
    public List<Topic> findAllTopics() {
        return repository.findAllTopics();
    }

}