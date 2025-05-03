package com.task_tracking_system.Logging_2.repository;

import com.task_tracking_system.Logging_2.model.TaskEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskEventRepository extends JpaRepository<TaskEvent, Long> {
}
