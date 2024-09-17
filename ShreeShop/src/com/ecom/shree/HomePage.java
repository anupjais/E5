package com.ecom.shree;

public class HomePage {
	User user;
	Cart cart = new Cart();
	Clothing clothing = new Clothing(cart);
	Electronics electronics = new Electronics(cart);
	Footwear footwear = new Footwear(cart);
	
	CheckOut checkOut = new CheckOut();
	public HomePage(User user) {
		this.user = user;
	}
	public void shopByCategory() {
		for(;;)
		{
			System.out.println();
			System.out.println("****** Home Page ******");
			System.out.println();
			System.out.println("\n1. Clothing\n2. Electronics\n3. Footwear\n4. Carts\n5. Proceed to Checkout\n6. Logout\n");
			System.out.print("Enter your option : ");
			int option = Welcome.sc.nextInt();
			
			switch(option)
			{
				case 1:
					clothing.products();
					break;
				case 2:
					electronics.products();
					break;
				case 3:
					footwear.products();
					break;
				case 4:
					cart.viewCart();
					break;
				case 5:
					checkOut.checkOut();
					break;
				case 6:
					System.out.println("Thank you for visiting to us.");
					System.out.println("Please Visit Again.");
					System.exit(0);
				default:
					System.err.println("Wrong Option Entered.");
			}
			
		}
	}
}
