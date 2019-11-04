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
    List<Widget> widgets = new ArrayList<Widget>();
    {
        Widget w1 = new Widget(123, "Heading Widget", "HEADING");
        Widget w2 = new Widget(234, "List Widget", "LIST");
        Widget w3 = new Widget(345, "Paragraph Widget", "PARAGRAPH");
        widgets.add(w1);
        widgets.add(w2);
        widgets.add(w3);
    }

    public List<Widget> createWidget(Widget widget) {
        widgets.add(widget);
        return widgets;
    }

    public List<Widget> updateWidget(Integer id, Widget newWidget) {
        for(Widget w: widgets) {
            if(w.getId() == id) {
                w.setName(newWidget.getName());
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

    public List<Widget> findAllWidget() {
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