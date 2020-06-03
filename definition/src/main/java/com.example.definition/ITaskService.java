package com.example.definition;

public interface ITaskService<T extends GenericTaskDto> {

    TaskType getTaskType();

    Result executeTask(T taskDto);

    void configureTask(T taskDto);
}
