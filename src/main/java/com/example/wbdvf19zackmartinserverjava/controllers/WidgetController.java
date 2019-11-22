package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Course;
import com.example.wbdvf19zackmartinserverjava.models.Module;
import com.example.wbdvf19zackmartinserverjava.models.Topic;
import com.example.wbdvf19zackmartinserverjava.models.Widget;
import com.example.wbdvf19zackmartinserverjava.repositories.ModuleRepository;
import com.example.wbdvf19zackmartinserverjava.repositories.TopicRepository;
import com.example.wbdvf19zackmartinserverjava.repositories.WidgetRepository;
import com.example.wbdvf19zackmartinserverjava.services.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

    @Autowired
    WidgetRepository repository;

    @Autowired
    TopicRepository topicRepository;


    @PostMapping("/api/topics/{tid}/widgets")
    public List<Widget> createWidget(@RequestBody Widget widget,
                                     @PathVariable("tid") Integer tid) {
        Topic topic = topicRepository.findTopicById(tid);
        widget.setTopic(topic);
        repository.save(widget);
        return repository.findAllWidgetsForTopic(tid);
    }

//    @PutMapping("/api/courses/{cid}/modules/{mid}/widgets/{widgetId}")
//    public List<Widget> updateWidget(
//            @RequestBody Widget newWidget,
//            @PathVariable("mid") Integer mid) {
//        Module module = moduleRepository.findModuleById(mid);
//        newWidget.setModule(module);
//        repository.save(newWidget);
//        return repository.findAllWidgetsForModule(mid);
//    }
//
//    @DeleteMapping("/api/courses/{cid}/modules/{mid}/widgets/{widgetId}")
//    public List<Widget> deleteWidget(@PathVariable("widgetId") Integer id,
//                                     @PathVariable("mid") Integer mid) {
//        repository.deleteWidgetBy(id);
//        return repository.findAllWidgetsForModule(mid);
//    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findAllWidgetsForTopic(@PathVariable("tid") Integer tid) {
        return repository.findAllWidgetsForTopic(tid);
    }

    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") Integer id) {
        return repository.findWidgetById(id);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
    }


    // createWidget
    // findAllWidgets
    // findWidgetById
    // updateWidget
    // deleteWidget

}
