package com.example.wbdvf19zackmartinserverjava.repositories;

import com.example.wbdvf19zackmartinserverjava.models.Lesson;
import com.example.wbdvf19zackmartinserverjava.models.Module;
import com.example.wbdvf19zackmartinserverjava.models.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicRepository
        extends CrudRepository<Topic, Integer> {
    @Query("select topic from Topic topic where topic.lesson.id = :lid")
    public List<Topic> findAllTopicsForLesson(
            @Param("lid") Integer lessonId
    );

    @Query("select topic from Topic topic where topic.id = :id")
    public Topic findTopicById(@Param("id") Integer id);


    @Query("select topic from Topic topic")
    public List<Topic> findAllTopics();
}