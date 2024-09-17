package com.ecom.shree;

public class Electronics {
	Cart cart;
	public Electronics(Cart cart) {
		this.cart = cart;
	}
	public void products() {
		for(;;)		
		{
			System.out.println("\n****** Electronics Section ******");
			System.out.println("\n1. Mobile (104)\n2. Laptop (105)\n3. Headphone (106)\n4. SmartWatch (107)\n5. HomePage (0)\n");
			
			System.out.print("Enter the id : ");
			int option = Welcome.sc.nextInt();
			switch(option)
			{
				case 104:
					cart.list.add("Mobile : 40000 /-");
					System.out.println("Mobile has been added inside cart.");
					break;
				case 105:
					cart.list.add("Laptop : 100000 /-");
					System.out.println("Laptop has been added inside cart.");
					break;
				case 106:
					cart.list.add("Headphone : 10500 /-");
					System.out.println("Headphone has been added inside cart.");
					break;
				case 107:
					cart.list.add("SmartWatch : 15000 /-");
					System.out.println("SmartWatch has been added inside cart.");
					break;
				case 0:
					return;
				default:
					System.err.println("Wrong option Entered.");
			}
		}
	}
}
