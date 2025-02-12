package day3_inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + " Kaydedildi ");
	}
     //bulk insert
	public void addMultiple(Customer [] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi ");
	}*/
}
//SOLİD- Open Closed Principle
