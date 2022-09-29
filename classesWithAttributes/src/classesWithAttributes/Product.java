package classesWithAttributes;
public class Product {
	//Attributes veya || field denilir. nitelikler veya alanlar.
	private int id;
	private String name;
	private String description;
	private double unitPrice;
	private int stockAmount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; // this içerisinde bulunduğumuz class ıd demek
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this içerisinde bulunduğumuz class ıd demek
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description; // this içerisinde bulunduğumuz class ıd demek
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice; // this içerisinde bulunduğumuz class ıd demek
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount; // this içerisinde bulunduğumuz class ıd demek
	}
	}
