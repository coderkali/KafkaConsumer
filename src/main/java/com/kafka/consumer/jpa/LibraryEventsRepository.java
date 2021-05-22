package com.kafka.consumer.jpa;


import com.kafka.consumer.entity.LibraryEvent;
import org.springframework.data.repository.CrudRepository;

public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}
