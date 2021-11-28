package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository //так необходимо аннотировать классы репозиториев
//PagingAndSortingRepository - это интерфейс, который обеспечивает основные CRUD операции, а также получение пагинированного списка.
//В угловых скобках указаны класс сущности и класс Id сущности.
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
