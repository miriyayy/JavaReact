package entities;

public class Player {
	private int id;
	private String lastName;
	private String dateOfBirth;
	private String nationaltyId;
	private String firstName;
	
	public Player() {
		
	}

	public Player(int id, String firtName, String lastName, String dateOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtName() {
		return firstName;
	}

	public void setFirtName(String firtName) {
		this.firstName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

}
