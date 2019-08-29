package com.appspot.nighantu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Balake {
	
	@Id
	private String englishBalake;
	private String kannadaBalake;
	
	@ManyToOne
	private Pada pada;
	
	public Balake() {
	}
	
	public Balake(String kannadaBalake, String englishBalake) {
		this.kannadaBalake = kannadaBalake;
		this.englishBalake = englishBalake;
	}

	public String getKannadaBalake() {
		return kannadaBalake;
	}

	public void setKannadaBalake(String kannadaBalake) {
		this.kannadaBalake = kannadaBalake;
	}

	public String getEnglishBalake() {
		return englishBalake;
	}

	public void setEnglishBalake(String englishBalake) {
		this.englishBalake = englishBalake;
	}

	public Pada getPada() {
		return pada;
	}

	public void setPada(Pada pada) {
		this.pada = pada;
	}
	
	
	
	
}
