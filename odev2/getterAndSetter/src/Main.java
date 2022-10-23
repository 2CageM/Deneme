
public class Main {

	public static void main(String[] args) {
	

		Product product = new Product(1, "Laptop", "Asus Laptop", 32112, 22, "Siyah");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getKod());
		
		
		
	}

}
