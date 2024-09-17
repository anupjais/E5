package com.ecom.shree;

public class Footwear {
	Cart cart;
	public Footwear(Cart cart) {
		this.cart = cart;
	}
	public void products() {
		for(;;)		
		{
			System.out.println("\n****** Footwear Section ******");
			System.out.println("\n1. Shoes (108)\n2. Crocks (109)\n3. Slids (110)\n4. Slippers (111)\n5. HomePage (0)\n");
			
			System.out.print("Enter the id : ");
			int option = Welcome.sc.nextInt();
			switch(option)
			{
				case 108:
					cart.list.add("Shoes : 12000 /-");
					System.out.println("Shoes has been added inside cart.");
					break;
				case 109:
					cart.list.add("Crocks : 1000 /-");
					System.out.println("Crocks has been added inside cart.");
					break;
				case 110:
					cart.list.add("Slids : 1500 /-");
					System.out.println("Slids has been added inside cart.");
					break;
				case 111:
					cart.list.add("Slippers : 1000 /-");
					System.out.println("Slippers has been added inside cart.");
					break;
				case 0:
					return;
				default:
					System.err.println("Wrong option Entered.");
			}
		}
	}
}
