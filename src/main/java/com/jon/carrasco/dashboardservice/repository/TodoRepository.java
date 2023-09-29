package com.jon.carrasco.dashboardservice.repository;


import com.jon.carrasco.dashboardservice.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
