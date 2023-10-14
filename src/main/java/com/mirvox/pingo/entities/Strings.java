package com.mirvox.pingo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Strings implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String strings;


	// CONSTRUCTORS
	
	public Strings() {
	}
	
	public Strings(Long id, String strings) {
		this.id = id;
		this.strings = strings;
	}

	// GETS E SETS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStrings() {
		return strings;
	}

	public void setStrings(String strings) {
		this.strings = strings;
	}

	// HASHCODE E EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Strings other = (Strings) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
