package day3LearnHub;

public class InstructorManager extends UserManager {
  public void addLesson(Instructor insructor) {
	  System.out.println(insructor.getFirstName()+" " +insructor.getLastName()+" added a lesson ");
  }
	
}
