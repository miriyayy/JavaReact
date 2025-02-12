package day3LearnHub;

public class Lesson {
	private int id;
	private String name;
	private Instructor instructor;

	public Lesson(int id, String name, Instructor instructor) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;

	}

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

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
