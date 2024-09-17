package com.ecom.shree;

import java.util.Scanner;

public class Welcome {
	static Scanner sc = new Scanner(System.in);
	User user;
	public void welcomeUser() {
		for(;;)
		{
			System.out.println();
			System.out.println("****** Welcome Page ******");
			System.out.println("\n1. New user\n2. Existing\n");
			System.out.print("Enter your option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					registerNewUser();
					break;
				case 2:
					loginUser();
					break;
				default:
					System.err.println("Wrong Option Input.");
			}
		}
	}
	private void loginUser() {
		if(user!=null)
		{
			for(int i=0; i<3; i++)
			{
				System.out.print("Your name/phone : ");
				String cred=sc.next();
				System.out.print("Password : ");
				String pass= sc.next();
				if((user.getName().equals(cred)||user.getPhone().equals(cred))&&user.getPassword().equals(pass))
				{
					homePage();
				}
				else {
					System.out.println("Incorrect credential.");
				}
			}
			System.out.println("Your trail is finished.");
			System.exit(0);
		}
		else {
			System.err.println("Create your account first.");
		}
	}
	private void registerNewUser() {
		System.out.println();
		System.out.print("Name : ");
		String name=sc.nextLine();
		System.out.print("Phone : ");
		String phone=sc.next();
		System.out.print("Address : ");
		String address=sc.nextLine();
		System.out.print("Password : ");
		String password=sc.next();
		
		user = new User(name, phone, address, password);
		System.out.println("Congrats! \033[1m"+user.getName()+"\033[0m Account created.");
	}

}
