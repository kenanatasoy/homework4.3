package Entities;

import java.time.LocalDate;

public class Player {
	
	private int id;
	private int identityNumber;
	private LocalDate birthYear;
	private String firstName;
	private String lastName;
	
	public Player() {
		
	}
	
	public Player(int id, int identityNumber, LocalDate birthYear, String firstName, String lastName) {
		super();
		this.id = id;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(LocalDate birthYear) {
		this.birthYear = birthYear;
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
	
}
