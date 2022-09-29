package oop1;
//PascalCase yazı stili ile classlar yazılır kelimelerin ilk harfleri büyük.

//burada ürünleri tanımlayabileceğimiz ortam hazırlanır.

public class Product {
	private String name;
	// camelCase
	private double unitPrice;
	private double discount; // indirim oranı
	private String imageurl;
	private int unitsInStock;

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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
