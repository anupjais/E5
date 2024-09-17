package com.ecom.shree;

public class Clothing {

	Cart cart;
	public Clothing(Cart cart) {
		this.cart = cart;
	}
	public void products() {
		for(;;)		
		{
			System.out.println("\n****** Clothing Section ******");
			System.out.println("\n1. Shitrs (100)\n2. T-shirt (101)\n3. Jeans (102)\n4. Hoodie (103)\n5. HomePage (0)\n");
			
			System.out.print("Enter the id : ");
			int option = Welcome.sc.nextInt();
			switch(option)
			{
				case 100:
					cart.list.add("Shirt : 1200 /-");
					System.out.println("Shirt has been added inside cart.");
					break;
				case 101:
					cart.list.add("T-shirt : 1000 /-");
					System.out.println("T-shirt has been added inside cart.");
					break;
				case 102:
					cart.list.add("Jeanse : 2500 /-");
					System.out.println("Jeanse has been added inside cart.");
					break;
				case 103:
					cart.list.add("Hoodie : 1500 /-");
					System.out.println("Hoodie has been added inside cart.");
					break;
				case 0:
					return;
				default:
					System.err.println("Wrong option Entered.");
			}
		}
	}

}
