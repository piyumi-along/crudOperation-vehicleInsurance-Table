package com.example.Insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String dateLisned;
	private String addressStreat;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateLisned() {
		return dateLisned;
	}
	public void setDateLisned(String dateLisned) {
		this.dateLisned = dateLisned;
	}
	public String getAddressStreat() {
		return addressStreat;
	}
	public void setAddressStreat(String addressStreat) {
		this.addressStreat = addressStreat;
	}
	

}
