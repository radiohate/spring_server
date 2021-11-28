package com.example.demo.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data //от библиотеки lombok, позволяет не писать руками getter'ы, setter'ы
@Entity //должна быть на каждой сущности(entity)
public class Task {
    @Id //указывает на primary key таблицы. Должна быть в каждой сущности
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // говорит о том, как заполнять поле. В данном случае, за автозаполнение отвечает тип поля bigserial в Postgresql.
    private Long id;
    private LocalDate date;
    private String description;
    private boolean done;
}
