package com.example.parent;

import com.example.definition.ITaskService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TaskServiceLocator {
    private Map<TaskType, ITaskService> taskServiceMap = new HashMap<>();

    public void registerTask(TaskType taskType, ITaskService taskService){
        taskServiceMap.put(taskType, taskService);
    }

    public ITaskService lookupTaskService(TaskType taskType){
        if(!taskServiceMap.containsKey(taskType))
            throw new RuntimeException("Task Type "+ taskType.getValue() +" is not registered in the system");
        return taskServiceMap.get(taskType);
    }
}
