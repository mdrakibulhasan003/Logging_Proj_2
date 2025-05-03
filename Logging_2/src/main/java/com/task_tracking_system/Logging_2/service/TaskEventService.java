package com.task_tracking_system.Logging_2.service;


import com.task_tracking_system.Logging_2.model.TaskEvent;
import com.task_tracking_system.Logging_2.repository.TaskEventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskEventService {

    private final TaskEventRepository taskEventRepository;

    public TaskEventService(TaskEventRepository taskEventRepository) {
        this.taskEventRepository = taskEventRepository;
    }

    public List<TaskEvent> listAllTasks(){
        return taskEventRepository.findAll();
    }

    public void logTaskEvent(String status, String description){
        TaskEvent taskEvent = new TaskEvent(status, description, LocalDateTime.now().toString());
    }
}
