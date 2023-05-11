package com.abramik.calendar.event;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository repository;


    public List<Event> getEvents() {
    return repository.findAll();
    }

    public Event getEvent(BigInteger id) {
        Optional<Event> eventOptional = repository.findById(id);
        return eventOptional.orElseThrow(() -> new NoSuchElementException("Nie ma takiego wydarzenia"));
    }

    public Event addNewEvent(Event event) {
        return repository.save(event);
    }
}
