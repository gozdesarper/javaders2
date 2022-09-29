package oop1;

public class Main {

	private static Customer corporateCustomer;
	private static Customer individualCustomer;

	public static void main(String[] args) {
		//hepsi burada uygulaması
		Product product1 = new Product();     // get işlemi okumak ekrana yazdırmak
		//set ettik. değer atadık.           //System.out.println(product1.name);
		product1.setName  ("deoling kahve makinası");
		product1.setUnitPrice (7500);
		product1.setDiscount (7);
		product1.setUnitsInStock (3);
		product1.setImageurl ("goz.jpg");
		
		Product product2 = new Product();
		product2.setName ( "sony kahve makinası");
		product2.setUnitPrice  (6500);
		product2.setDiscount  (9);
		product2.setUnitsInStock (5);
		product2.setImageurl ("sar.jpg");
		
		Product product3 = new Product();
		product3.setName ("vestel kahve makinası");
		product3.setUnitPrice (10500);
		product3.setDiscount (9);
		product3.setUnitsInStock (2);
		product3.setImageurl ("ves.jpg");
		Product[] products = {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) { // veri tipi product orta takma değer products her bir elemanı için dön
		System.out.println("<li>" + product.getName() + "</li>");
		System.out.println("<ul>");
		
		//banka uygulaması
		IndividualCustomer individualCustomer = new IndividualCustomer();
	    individualCustomer.setId(1);
	    individualCustomer.setPhone("05386931456");
	    individualCustomer.setCustomerNumber("0236546");
	    individualCustomer.setFirstName("gözde");
	    individualCustomer.setLastName("sarper");
	    
	    CorporateCustomer corporateCustomer = new CorporateCustomer();
	    corporateCustomer.setId(2);
	    corporateCustomer.setCustomerNumber("21211");
	    corporateCustomer.setPhone("3515611332");
	    corporateCustomer.setCompanyName("sarper holding");
	    corporateCustomer.setTaxNumber("3231511");
		}
		Customer[] customer = {individualCustomer,corporateCustomer};
	}

}
