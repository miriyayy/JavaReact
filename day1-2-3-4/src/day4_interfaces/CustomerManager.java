package day4_interfaces;

public class CustomerManager {

	private Logger[]  loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
	}

//loosly- tightl coupled
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi : " + customer.getFirstName());
		
		//Utils utils= new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müşteri silindi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		}


	}

