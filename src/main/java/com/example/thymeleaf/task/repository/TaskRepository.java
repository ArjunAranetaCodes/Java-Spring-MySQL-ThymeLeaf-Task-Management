package com.example.thymeleaf.task.repository;

import com.example.thymeleaf.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
