package com.project.gamerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.gamerback.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

}
