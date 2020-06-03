package com.example.parent;

import com.example.definition.GenericTaskDto;
import com.example.definition.TaskType;

public class TaskWrapperDto<T extends GenericTaskDto> {
    T taskDto;
    TaskType taskType;
    String otherConfig1;
    String otherConfig2;
}
