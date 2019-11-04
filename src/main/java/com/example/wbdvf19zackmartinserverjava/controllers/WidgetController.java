package com.example.wbdvf19zackmartinserverjava.controllers;

import com.example.wbdvf19zackmartinserverjava.models.Widget;
import com.example.wbdvf19zackmartinserverjava.services.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

    WidgetService service = WidgetService.getInstance();

    @PostMapping("/api/widgets")
    public List<Widget> createWidget(@RequestBody Widget widget) {
        return service.createWidget(widget);
    }

    @PutMapping("/api/widgets/{widgetId}")
    public List<Widget> updateWidget(
            @PathVariable("widgetId") Integer id,
            @RequestBody Widget newWidget) {
        System.out.println("WE ARE HERE " + id);
        return service.updateWidget(id, newWidget);
    }

    @DeleteMapping("/api/widgets/{widgetId}")
    public List<Widget> deleteWidget(@PathVariable("widgetId") Integer id) {
        return service.deleteWidget(id);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidget() {
        return service.findAllWidget();
    }

    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") Integer id) {
        return service.findWidgetById(id);
    }

    // createWidget
    // findAllWidgets
    // findWidgetById
    // updateWidget
    // deleteWidget

}
