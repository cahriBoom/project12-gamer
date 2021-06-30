package com.project.gamerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.gamerback.model.Gamer;

@Repository
public interface GamerRepository extends JpaRepository<Gamer, Integer>{

}
