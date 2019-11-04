package com.example.wbdvf19zackmartinserverjava.models;

public class Widget {
    private Integer id;

    public Widget() {
    }

    private String name;
    private String type;
    private String text = "";
    private int size = 1;
    private String url = "";
    private boolean ordered = false;

    public Widget(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}