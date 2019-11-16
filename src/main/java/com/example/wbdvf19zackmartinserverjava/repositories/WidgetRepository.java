package com.example.wbdvf19zackmartinserverjava.repositories;

import com.example.wbdvf19zackmartinserverjava.models.Widget;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface WidgetRepository extends CrudRepository<Widget, Integer> {
    @Query("select widget from Widget widget where widget.id=:widgetId")
    public Widget findWidgetById(@Param("widgetId") Integer id);

    @Query("select widget from Widget widget")
    public List<Widget> findAllWidgets();

    @Modifying
    @Transactional
    @Query("delete from Widget widget where widget.id=:widgetId")
    public void deleteWidgetsBy(@Param("widgetId") Integer id);

}
