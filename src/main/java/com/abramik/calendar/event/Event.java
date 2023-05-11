package com.abramik.calendar.event;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
@Setter
@Getter
@Entity
@Table(name = "event")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(generator = "sequenceRem", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenceRem", sequenceName = "sequenceRem" , allocationSize = 50)
    private Long id;
    private String name;
    private String category;
    private String description;
    private LocalDateTime startEventTime;
    private LocalDateTime endEventTime;
    private boolean isActive;
}
