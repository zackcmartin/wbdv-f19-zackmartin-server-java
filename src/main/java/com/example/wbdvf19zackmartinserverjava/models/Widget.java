package com.example.wbdvf19zackmartinserverjava.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="widgets")
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private Integer orderPlace;
    private String text = "";
    private Integer size = 1;
    private String url = "";
    private Boolean ordered = false;


    public Widget(){

    }

    public Widget(int id, String name, String type, Integer orderPlace) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.orderPlace = orderPlace;
    }

    @ManyToOne
    @JsonIgnore
    private Topic topic;

    public Integer getId() {
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

    public Integer getOrderPlace(){
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

    public Integer getSize() {
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

    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(boolean b){
        this.ordered = b;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}