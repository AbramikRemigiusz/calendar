package com.abramik.calendar.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface EventRepository extends JpaRepository<Event, BigInteger> {
}
