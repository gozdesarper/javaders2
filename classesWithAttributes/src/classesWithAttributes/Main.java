package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1);
		product.setName("laptop");
		product.setDescription("ödklvndjkvn");
		product.setStockAmount(3);
		product.setUnitPrice(5000);

		ProductManagerr productManagerr = new ProductManagerr();
		productManagerr.Add(product);
		
	}

}
