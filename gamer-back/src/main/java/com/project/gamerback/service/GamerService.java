package com.project.gamerback.service;

import java.util.List;

import com.project.gamerback.model.Gamer;

public interface GamerService {

	List<Gamer> getAll();

	Gamer saveGamer(Gamer gamer);
}
