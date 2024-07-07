package CodeClauseInternship.E_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> cartItems;
	
	public Cart()
	{
		cartItems = new ArrayList<>();
	}
	
	public void AddProduct(Product product)
	{
		cartItems.add(product);
	}
	
	public List<Product> getCartItems()
	{
		return cartItems;
		
	}
	
	public double calculateTotal()
	{
		double total = 0;
		
		for(Product product : cartItems)
		{
			total += product.getPrice();
		}
		
		return total;
	}
	
}
