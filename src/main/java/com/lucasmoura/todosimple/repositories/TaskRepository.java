package com.lucasmoura.todosimple.repositories;

import java.util.List;
import java.util.Optional;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lucasmoura.todosimple.models.Task;

@Repository
public interface TaskRepository  extends JpaAttributeConverter<Task, Long>{

    List<Task> findByUser_Id(Long id);

//    @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")    
 //   List<Task> findByUser_Id(@Param("id") Long id);

 //@Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)   
 //List<Task> findByUser_id(@Param("id") long id);


    
}
