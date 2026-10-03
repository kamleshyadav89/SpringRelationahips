package com.itvedant.relationships.one_one;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String passNo;
	private LocalDate issuDate,expDate;
	
	
	@OneToOne
	@JoinColumn
	private Person person;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPassNo() {
		return passNo;
	}


	public void setPassNo(String passNo) {
		this.passNo = passNo;
	}


	public LocalDate getIssuDate() {
		return issuDate;
	}


	public void setIssuDate(LocalDate issuDate) {
		this.issuDate = issuDate;
	}


	public LocalDate getExpDate() {
		return expDate;
	}


	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	

}
