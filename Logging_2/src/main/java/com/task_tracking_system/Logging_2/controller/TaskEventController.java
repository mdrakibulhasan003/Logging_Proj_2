package com.task_tracking_system.Logging_2.controller;

import com.task_tracking_system.Logging_2.service.TaskEventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task-events")
public class TaskEventController {

    private final TaskEventService taskEventService;

    public TaskEventController(TaskEventService taskEventService) {
        this.taskEventService = taskEventService;
    }

    @GetMapping
    public String getAllTaskEvents(Model model){
        model.addAttribute("task-events", taskEventService.listAllTasks());
        return "task-event-list";
    }
}
