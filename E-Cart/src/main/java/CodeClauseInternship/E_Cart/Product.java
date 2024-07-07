package CodeClauseInternship.E_Cart;

public class Product {

	private String name;
	private double price;
	public int id;
	
	public Product(int id, String name, double price)
	{
		this.name = name;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}
}
