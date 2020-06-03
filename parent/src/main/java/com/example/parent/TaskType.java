package com.example.parent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Types of tasks.
 */
@Getter
@AllArgsConstructor
public enum TaskType {
    IMPORTED("Consent", 1);

    private static final Map<String, TaskType> VALUE_MAP = Stream.of(values()).collect(Collectors.toMap(k -> k.getValue().toUpperCase(), v -> v));

    @JsonValue
    private String value;
    private Integer constant;

    /**
     * Creates {@link TaskType} enum from the given string.<br>
     * Considers case insensitive input string, compares with the uppercase
     * value to match the enum constant.
     *
     * @param type Task type as string
     * @return Task type as enum
     */
    @JsonCreator
    public static TaskType fromString(final String type) {
        try {
            if (type != null && type.strip().length() > 0) {
                return VALUE_MAP.computeIfAbsent(type.strip().toUpperCase(), TaskType::valueOf);
            }
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Task type invalid. Valid values are: ".concat(List.of(values()).toString()));
        }
        return null;
    }
}
