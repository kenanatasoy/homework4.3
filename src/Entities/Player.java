package Entities;



public class Player {
	
	private int id;
	private long identityNumber;
	private int birthYear;
	private String firstName;
	private String lastName;
	
	public Player() {
		
	}
	
	public Player(int id, long identityNumber, int birthYear, String firstName, String lastName) {
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

	public long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
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
