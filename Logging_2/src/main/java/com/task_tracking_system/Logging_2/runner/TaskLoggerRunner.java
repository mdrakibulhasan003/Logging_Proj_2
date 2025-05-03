package com.task_tracking_system.Logging_2.runner;

import com.task_tracking_system.Logging_2.service.TaskEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskLoggerRunner implements ApplicationRunner {

    private final TaskEventService taskEventService;

    @Autowired
    public TaskLoggerRunner(TaskEventService taskEventService) {
        this.taskEventService = taskEventService;
    }

    public void run(ApplicationArguments args) throws Exception{
        taskEventService.logTaskEvent("Created", "Task: prepare report assigned.");
        taskEventService.logTaskEvent("Completed", "Task: Prepare report completed.");
        taskEventService.logTaskEvent("Failed", "Task: Send failed due to network issue");
    }
}
