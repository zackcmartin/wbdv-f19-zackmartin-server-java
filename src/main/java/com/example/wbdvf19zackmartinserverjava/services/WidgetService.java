package com.example.wbdvf19zackmartinserverjava.services;
import com.example.wbdvf19zackmartinserverjava.models.Widget;

import java.util.ArrayList;
import java.util.List;

public class WidgetService {

    static WidgetService myInstance = null;

     public static WidgetService getInstance() {
        if (myInstance == null) {
            myInstance = new WidgetService();
        }
        return myInstance;
    }

    enum type {
         HEADING, LIST, PARAGRAPH, IMAGE, LINK
    }
    List<Widget> widgets = new ArrayList<Widget>();
    {
        Widget w1 = new Widget(123, "Heading Widget", "HEADING", 1);
        Widget w2 = new Widget(234, "List Widget", "LIST", 2);
        Widget w3 = new Widget(345, "Paragraph Widget", "PARAGRAPH", 3);
        widgets.add(w1);
        widgets.add(w2);
        widgets.add(w3);
    }

    int orderPlace = 4;

    public List<Widget> createWidget(Widget widget) {
        widget.setOrderPlace(orderPlace);
        widgets.add(widget);
        orderPlace++;
        return widgets;
    }

    public List<Widget> updateWidget(Integer id, Widget newWidget) {
        for(Widget w: widgets) {
            if(w.getId() == id) {
                w.setName(newWidget.getName());
                w.setType(newWidget.getType());
                w.setText(newWidget.getText());
                w.setUrl(newWidget.getUrl());
                w.setOrdered(newWidget.getOrdered());
                w.setOrderPlace(newWidget.getOrderPlace());
                w.setSize(newWidget.getSize());
            }
        }
        return widgets;
    }

    public List<Widget> deleteWidget(Integer id) {
        int index = -1;
        for(int i=0; i<widgets.size(); i++) {
            if(widgets.get(i).getId() == id) {
                index = i;
            }
        }
        widgets.remove(index);
        return widgets;
    }

    public List<Widget> findAllWidgets() {
        return widgets;
    }

    public Widget findWidgetById(Integer id) {
        for(Widget w: widgets) {
            if(w.getId() == id) {
                return w;
            }
        }
        return null;
    }
}