package com.example.parent;

import com.example.definition.ITaskService;
import com.example.definition.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TaskServiceLocator {

    @Autowired
    List<ITaskService> registeredTaskServices;

    ITaskService lookupTaskService(TaskType taskType){
        return registeredTaskServices.stream()
                .filter(taskService -> taskService.getTaskType().equals(taskType))
                .findFirst()
                .orElseThrow();
    }
}
