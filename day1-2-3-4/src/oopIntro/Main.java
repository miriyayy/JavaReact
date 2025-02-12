package oopIntro;

public class Main {
	public static void main(String[] args) {

//hepsiburada sitesini inceleyiyoruz
		// Classlar referans tiptir

		Product product1 = new Product(1, "Lenova V14", 15000, "16 GB RAM", 10); // referans oluşturma,intance
		/*
		 * product1.id = 1; product1.name = "lenova v14"; product1.unitPrice = 15000;
		 * product1.detail = "16 GB Ram";
		 */

		Product product2 = new Product(); // referans oluşturma,intance
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitpriceAfterDiscount());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Product product3 = new Product(); // referans oluşturma,intance

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {

			System.out.println(product.name);

		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";

		// bir classı kullanma yöntemi
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);

		productManager.addToCart(product3);*/

	}
}
