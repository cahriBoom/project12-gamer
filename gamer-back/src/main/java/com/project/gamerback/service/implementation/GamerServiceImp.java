package com.project.gamerback.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.gamerback.model.Gamer;
import com.project.gamerback.repository.GamerRepository;
import com.project.gamerback.service.GamerService;

@Service
public class GamerServiceImp implements GamerService{

	
	@Autowired
	private GamerRepository gamerRepository;

	@Override
	public List<Gamer> getAll() {
		List<Gamer> all = gamerRepository.findAll();
		return all;
	}

	@Override
	public Gamer saveGamer(Gamer gamer) {
		int id = gamer.getId();
		gamerRepository.save(gamer);
		Gamer nwGamer = gamerRepository.getById(id);
		return nwGamer;
	}
	
	
}
