package CodeClauseInternship.E_Cart;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	
    	Cart cart = new Cart();
    	
    	Product product1 = new Product(11, "Laptop", 999.00);
    	Product product2 = new Product(22, "Keyboard", 149.00);
    	Product product3 = new Product(33, "Mouse", 99.00);
    	Product product4 = new Product(44, "Headphones", 249.00);
    	Product product5 = new Product(55, "Speaker", 199.00);
    	
    	boolean shopping = true;
    	
    	while(shopping)
    	{
    		System.out.println("Available Products:");
    		System.out.println("1. "+ product1.getName()+"("+product1.getId()+")\n $ "+ product1.getPrice());
    		System.out.println("2. "+ product2.getName()+"("+product2.getId()+")\n $ "+ product2.getPrice());
    		System.out.println("3. "+ product3.getName()+"("+product3.getId()+")\n $ "+ product3.getPrice());
    		System.out.println("4. "+ product4.getName()+"("+product4.getId()+")\n $ "+ product4.getPrice());
    		System.out.println("5. "+ product5.getName()+"("+product5.getId()+")\n $ "+ product5.getPrice());
    		System.out.println("Enter the Id of product to add to the cart, or 00 to Checkout");
    		
    		int choice = scanner.nextInt();
    		
    		switch(choice)
    		{
    			case 00:
    				shopping = false;
    				break;
    			case 11:
    				cart.AddProduct(product1);
    				System.out.println(product1.getName()+" added to Cart.");
    				break;
    			case 22:
    				cart.AddProduct(product2);
    				System.out.println(product2.getName()+" added to Cart.");
    				break;
    			case 33:
    				cart.AddProduct(product3);
    				System.out.println(product3.getName()+" added to Cart.");
    				break;
    			case 44:
    				cart.AddProduct(product4);
    				System.out.println(product4.getName()+" added to Cart.");
    				break;
    			case 55:
    				cart.AddProduct(product5);
    				System.out.println(product5.getName()+" added to Cart.");
    				break;
    			default:
    				System.out.println("Invalid Choice");
    		}
    	}
    	
    	System.out.println("\nCart:");
    	
    	for(Product product : cart.getCartItems())
    	{
    		System.out.println(product.getName() + " - $" + product.getPrice());
    	}
    	
    	System.out.println("Total: $"+ cart.calculateTotal());
    	
    	System.out.println("\nThank You! Have a Good Day!");
    }
}
