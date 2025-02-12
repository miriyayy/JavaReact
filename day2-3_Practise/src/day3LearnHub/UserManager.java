package day3LearnHub;

public class UserManager {
	public void addSystemUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added to the system.");
	}

	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " logged in.");
	}

	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " logged out.");
	}

}
