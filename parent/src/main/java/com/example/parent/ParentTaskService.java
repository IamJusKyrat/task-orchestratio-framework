package com.example.parent;

import com.example.definition.Result;
import org.springframework.beans.factory.annotation.Autowired;


public class ParentTaskService {

    @Autowired
    TaskServiceLocator taskServiceLocator;

    public void registerTasks(){}

    public void configure(TaskWrapperDto taskWrapperDto){
        taskServiceLocator.lookupTaskService(taskWrapperDto.taskType).configureTask(taskWrapperDto.taskDto);
    }

    public Result execute(TaskWrapperDto taskWrapperDto){
        return taskServiceLocator.lookupTaskService(taskWrapperDto.taskType).executeTask(taskWrapperDto.taskDto);
    }
}
