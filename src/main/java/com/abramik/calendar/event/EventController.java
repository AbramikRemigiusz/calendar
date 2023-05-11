package com.abramik.calendar.event;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/events")
public class EventController {
    private final EventService service;

    @GetMapping(path = "")
    public List<Event> getEvents(){
        return service.getEvents();
    }
    @GetMapping(path = "/{id}")
    public Event getEvent(@PathVariable(name = "id") BigInteger id){
        return service.getEvent(id);
    }
    @PostMapping(path = "")
    public Event addEvent(@RequestBody EventDto eventDto){
        return service.addNewEvent(Event.builder()
                .name(eventDto.getName())
                .category(eventDto.getCategory())
                .description(eventDto.getDescription())
                .startEventTime(eventDto.getStartEventTime())
                .endEventTime(eventDto.getEndEventTime())
                .isActive(eventDto.isActive())
                .build()
        );
    }
}
