package day3LearnHub;

public class StudentManager extends UserManager {

	public void attendLesson(Student student, Lesson lesson) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " attended the lesson " + lesson.getName()+ " taught by instructor: "
				+ lesson.getInstructor().getFirstName()+ " "+ lesson.getInstructor().getLastName());
	}
	
}
