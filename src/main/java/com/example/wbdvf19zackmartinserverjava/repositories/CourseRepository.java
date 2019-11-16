package com.example.wbdvf19zackmartinserverjava.repositories;
import com.example.wbdvf19zackmartinserverjava.models.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface CourseRepository
        extends CrudRepository<Course, Integer> {

    @Query("select course from Course course")
    public List<Course> findAllCourses();

    @Query("select course from Course course where course.id=:cid")
    public Course findCourseById(@Param("cid") Integer id);

    @Modifying
    @Transactional
    @Query("delete from Course course where course.id=:courseId")
    public void deleteCourseBy(@Param("courseId") Integer id);
}