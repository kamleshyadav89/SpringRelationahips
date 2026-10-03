package com.itvedant.relationships.many_to_many;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String name;
	private String gender;
	private LocalDate brithDate;
	
	@ManyToMany(mappedBy = "allPatients")
	private List<Docter> mydocters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(LocalDate brithDate) {
		this.brithDate = brithDate;
	}

	public List<Docter> getMydocters() {
		return mydocters;
	}

	public void setMydocters(List<Docter> mydocters) {
		this.mydocters = mydocters;
	}
	
}
