package com.revature.models;

import java.util.Scanner;

public class Menu {
	
	int id;
    String username;
    String password;
    Role role;

    public void displayMenu(){
	//NEW FUN COOL WAY OF GETTING USER INPUTS - MENU
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Employee or Manager Login?");
	System.out.println("=========================");
//	System.out.println("username?");
//	System.out.println("id?");
//	System.out.println("role?");
	
	String input = scan.nextLine();
	
	switch(input) {
	
	case "manager" :{
		System.out.println("Enter an manager id");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter username");
		username = scan.nextLine();
		System.out.println("Enter password");
		password = scan.nextLine();
		System.out.println("You have successfully logged in! \n");
		break;
	}
	
	case "employee" : {
		System.out.println("Enter employee id");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter username");
		username = scan.nextLine();
		System.out.println("Enter password");
		password = scan.nextLine();
		System.out.println("You have successfully logged in! \n");
		break;
	}
	
	default: {
		System.out.println("Unfortunately we don't know who you are and cannot log you in at this time. Please try again later.");
		System.exit(0);
	}
		
	}
	
	
	System.out.println("Enter 1 to VIEW PAST TICKETS \n or Enter 2 to ADD A REIMBURSMENT REQUEST ");
	String input2 = scan.nextLine();
	
	switch(input2) {
	case "1": {

		
	}
	case "2": {
		
	}
	
	}
	
}
}


