package oopIntro;

public class ProductManager {
	public void addToCart( Product product ) { 
		System.out.println("Sepete eklendi!"+ product.getName());
		//productın bellek adresini göndermiş oluyoruz
		//okumak için-get, yazmak için-set
	}
}
