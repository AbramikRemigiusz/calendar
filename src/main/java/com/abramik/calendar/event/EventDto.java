package com.abramik.calendar.event;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class EventDto {
    private String name;
    private String category;
    private String description;
    private LocalDateTime startEventTime;
    private LocalDateTime endEventTime;
    private boolean isActive;
}
