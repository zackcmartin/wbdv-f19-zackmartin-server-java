package com.example.wbdvf19zackmartinserverjava.models;

public class Widget {
    private Integer id;
    private String name;
    private String type;
    private int orderPlace;
    private String text = "";
    private int size = 1;
    private String url = "";
    private boolean ordered = false;


    public Widget(int id, String name, String type, int orderPlace) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.orderPlace = orderPlace;
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

    public int getOrderPlace(){
        return orderPlace;
    }

    public void setOrderPlace(int place){
        this.orderPlace = place;
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

    public boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(boolean b){
        this.ordered = b;
    }
}