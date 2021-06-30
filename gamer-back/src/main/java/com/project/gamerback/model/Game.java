package com.project.gamerback.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column( name="id_game" )
	private int id;
	
	private String nom;
	
	private String plateform;
	
	@OneToMany(mappedBy="game")
	private List<Event> list_events;
	
	public Game() {
		this("","");
	}

	public Game(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPlateform() {
		return plateform;
	}

	public void setPlateform(String plateform) {
		this.plateform = plateform;
	}

	public List<Event> getList_events() {
		return list_events;
	}

	public void setList_events(List<Event> list_events) {
		this.list_events = list_events;
	}
	
	
}
