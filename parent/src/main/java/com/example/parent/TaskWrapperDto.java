package com.example.parent;

import com.example.definition.GenericTaskDto;

public class TaskWrapperDto<T extends GenericTaskDto> {
    T taskDto;
    TaskType taskType;
    String otherConfig1;
    String otherConfig2;
}
