package day2_oopIntro;

public class Product {
	//thsidekiler
	//encapsulation
		private int id;
		private String name;
		private double unitPrice;
		private String detail;
		private double discount;
		
		public Product() {
			
		}
		//source- generate constructor using fields
		public Product(int id, String name, double unitPrice, 
				String detail,double discount) {
			super();
			this.id = id;
			this.name = name;
			this.unitPrice = unitPrice;
			this.detail = detail;
			this.discount= discount;
			
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
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public double getUnitpriceAfterDiscount() {
			return this.unitPrice-(this.unitPrice*this.discount /100);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	/*public Product() {
		// constructor
		System.out.println("OKEY");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		//eşitleme yöntemi
		//thsi-bu classaki
		
		this(); //bu parametresiz olanı çalıştıracak
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}*/

}
//DON'T REPEAT YOURSELF
// METHODLAR İŞ YAPAN KOD BLOKLARIDIR
//SOLID