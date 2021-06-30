package com.project.gamerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.gamerback.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

}
