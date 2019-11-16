package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Widget;
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


    @PostMapping("/api/widgets")
    public List<Widget> createWidget(@RequestBody Widget widget) {
        repository.save(widget);
        return repository.findAllWidgets();
    }

    @PutMapping("/api/widgets/{widgetId}")
    public List<Widget> updateWidget(
            @RequestBody Widget newWidget) {
        repository.save(newWidget);
        return repository.findAllWidgets();
    }

    @DeleteMapping("/api/widgets/{widgetId}")
    public List<Widget> deleteWidget(@PathVariable("widgetId") Integer id) {
        repository.deleteWidgetsBy(id);
        return repository.findAllWidgets();
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
    }

    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") Integer id) {
        return repository.findWidgetById(id);
    }

    // createWidget
    // findAllWidgets
    // findWidgetById
    // updateWidget
    // deleteWidget

}
