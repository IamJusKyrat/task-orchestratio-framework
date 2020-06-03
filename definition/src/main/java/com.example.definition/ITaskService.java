package com.example.definition;

public interface ITaskService<T extends GenericTaskDto> {

    Result executeTask(T taskDto);

    void configureTask(T taskDto);
}
