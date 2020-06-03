package com.example.imported;

import com.example.definition.ITaskService;
import com.example.definition.Result;
import com.example.definition.TaskType;
import org.springframework.stereotype.Service;

@Service
public class ImportedTaskService implements ITaskService<ImportedTaskDto> {
    @Override
    public TaskType getTaskType() {
        return TaskType.IMPORTED;
    }

    @Override
    public Result executeTask(ImportedTaskDto taskDto) {
        //Blah blah spaghetti code !!
        return null;
    }

    @Override
    public void configureTask(ImportedTaskDto taskDto) {
        //Blah blah spaghetti code !!
    }

    public String performSpecialFunction() {
        return "This is special text";
    }

}
