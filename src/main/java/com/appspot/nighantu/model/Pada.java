package com.appspot.nighantu.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pada {
	
	@Id
	private String englishPada;
	private String kannadaPada;
	private String kannadaPadaInEnglish;
	
	public Pada() {
	}
	
	public Pada(String englishPada, String kannadaPada, String kannadaPadaInEnglish) {
		this.englishPada = englishPada;
		this.kannadaPada = kannadaPada;
		this.kannadaPadaInEnglish = kannadaPadaInEnglish;
	}
	
	public String getEnglishPada() {
		return englishPada;
	}
	public void setEnglishPada(String englishPada) {
		this.englishPada = englishPada;
	}
	public String getKannadaPada() {
		return kannadaPada;
	}
	public void setKannadaPada(String kannadaPada) {
		this.kannadaPada = kannadaPada;
	}

	public String getKannadaPadaInEnglish() {
		return kannadaPadaInEnglish;
	}

	public void setKannadaPadaInEnglish(String kannadaPadaInEnglish) {
		this.kannadaPadaInEnglish = kannadaPadaInEnglish;
	}
	
	
}
