package com.project.gamerback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.gamerback.model.Gamer;
import com.project.gamerback.service.GamerService;

@RestController
@RequestMapping("/api/")
public class GamerController {

	
	@Autowired
	private GamerService gamerService;
	
	@GetMapping()
	public ResponseEntity<?> listGamers(){
		List<Gamer> resource = gamerService.getAll();
		return ResponseEntity.ok(resource);		
	}
	
	
	@PostMapping()
	public ResponseEntity<?> SaveGamer(@RequestBody Gamer gamer){
		Gamer resource = gamerService.saveGamer(gamer);
		return ResponseEntity.ok(resource);
	}
}
