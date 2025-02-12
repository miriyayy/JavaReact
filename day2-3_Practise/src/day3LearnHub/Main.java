package day3LearnHub;

public class Main {

	public static void main(String[] args) {

		// System.out.println("-------STUDENT----------");

		Student student = new Student(1, "miray", "mutlu", "miray@gmail.com", "123456");

	    Student student1= new Student(2,"gökçe","ak","giz@gmail.com","54645");

		// System.out.println("-------INSTRUCTOR---------");

		Instructor instructor = new Instructor(1, "engin", "demiroğ", "engingmail.com", "789456");
		Instructor instructor2=new Instructor(2, "halit enes", "kalaycı", "enes@gmail.com", "4654");

		InstructorManager instructorManager = new InstructorManager();

		Lesson lesson = new Lesson(1, "Java-React", instructor);
		Lesson lesson1= new Lesson(2,"Python & Selenium",instructor2);
	

		StudentManager studentManager = new StudentManager();
		StudentManager student1Manager= new StudentManager();
		

		
		  /*studentManager.addSystemUser(student); studentManager.logIn(student);
		  studentManager.logOut(student);
		  
		  studentManager.addSystemUser(student1); studentManager.logIn(student1);
		  studentManager.logOut(student1);*/
		 
		
		studentManager.attendLesson(student, lesson);
		student1Manager.attendLesson(student1, lesson);
		student1Manager.attendLesson(student1, lesson1);
		

		/*
		 * instructorManager.addSystemUser(instructor);
		 * instructorManager.logIn(instructor); instructorManager.logOut(instructor);
		 */

	}

}
