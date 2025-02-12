package day2LearnPlatform;


public class Main {
	public static void main(String[] args) {
		
		Category category1= new Category(1, "Courses"); // referans oluşturma
		Category category2= new Category(2,"MY Courses");
		
		Category[] categories= {category1,category2};
		
		for(Category category: categories) {
			System.out.println(category.name);
		}
	
		//System.out.println(categories.length);
		
		CategoryManager categoryManager= new CategoryManager();
		categoryManager.selectCategory(category1);
		categoryManager.selectCategory(category2);
		
		
		Course course1= new Course(1," JAVA", "Engin Demiroğ");
		Course course2= new Course(2," JAVA-REACT", "Engin Demiroğ");
		Course course3=new Course(3, " C#+ANGULAR","Engin Demiroğ");
		Course course4= new Course(4," PYTHON&SELENIUM", "Halit Enes Klaycı");
		
		
		Course[] courses= {course1, course2,course3,course4};
		for(Course course: courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager= new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		courseManager.addCourse(course4);
		
		
		
		
		
	}
}
