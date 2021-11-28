package com.example.demo.controller;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*Аннотация @Autowired нужна, чтобы Spring подставил bean класса TaskRepository в данный класс.
@PostMapping указывает на то, что метод принимает POST запрос.
Аннотация @RequestBody ставится, если в запросе есть json тело, которое нужно сериализовать в Java объект.
В данном случае, мы ожидаем объект класса Task.
В самом методе идет вызов метода save от taskRepository. Метод save работает как на создание, так и на обновление
*/

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    public Task create(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
