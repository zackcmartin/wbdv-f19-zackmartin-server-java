package com.example.wbdvf19zackmartinserverjava.services;

import com.example.wbdvf19zackmartinserverjava.models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

//    static CourseService myInstance = null;
//
//    public static CourseService getInstance() {
//        if (myInstance == null) {
//            myInstance = new CourseService();
//        }
//        return myInstance;
//    }
//
//    List<Course> courses = new ArrayList<Course>();
//    {
//        Course c1 = new Course(123, "Course 1 from Server");
//        Course c2 = new Course(234, "Course 2 from Server");
//        Course c3 = new Course(345, "Course 3 from Server");
//        Course c4 = new Course(546, "Course 4 from Server");
//        courses.add(c1);
//        courses.add(c2);
//        courses.add(c3);
//        courses.add(c4);
//    }
//
//    int orderPlace = 4;
//
//    public List<Course> createCourse(Course course) {
//        Course c = new Course(course.getId(), course.getTitle());
//        courses.add(c);
//        orderPlace++;
//        return courses;
//    }
//
//    public List<Course> updateCourse(Integer id, Course newCourse) {
//        for(Course c: courses) {
//            if(c.getId() == id) {
//                c.setTitle(newCourse.getTitle());
//            }
//        }
//        return courses;
//    }
//
//    public List<Course> deleteCourse(Integer id) {
//        int index = -1;
//        for(int i=0; i<courses.size(); i++) {
//            if(courses.get(i).getId().equals(id)) {
//                index = i;
//            }
//        }
//        courses.remove(index);
//        return courses;
//    }
//
//    public List<Course> findAllCourses() {
//        return courses;
//    }
//
//    public Course findCourseById(Integer id) {
//        for(Course c: courses) {
//            if(c.getId() == id) {
//                return c;
//            }
//        }
//        return null;
//    }
}
