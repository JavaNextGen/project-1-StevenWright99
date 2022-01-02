//package com.revature.models;
//
//import java.util.Scanner;
//
//public class Menu {
//	
//	int id;
//    String username;
//    String password;
//    Role role;
//
//    public void displayMenu(){
//	//NEW FUN COOL WAY OF GETTING USER INPUTS - MENU
//	
//	Scanner scan = new Scanner(System.in);
//	
//	System.out.println("Employee or Manager Login?");
//	System.out.println("=========================");
////	System.out.println("username?");
////	System.out.println("id?");
////	System.out.println("role?");
//	
//	String input = scan.nextLine();
//	
//	switch(input) {
//	
//	case "manager" :{
//		System.out.println("Enter an manager id");
//		int id = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter username");
//		username = scan.nextLine();
//		System.out.println("Enter password");
//		password = scan.nextLine();
//		System.out.println("You have successfully logged in! \n");
//		break;
//	}
//	
//	case "employee" : {
//		System.out.println("Enter employee id");
//		int id = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter username");
//		username = scan.nextLine();
//		System.out.println("Enter password");
//		password = scan.nextLine();
//		System.out.println("You have successfully logged in! \n");
//		break;
//	}
//	
//	default: {
//		System.out.println("Unfortunately we don't know who you are and cannot log you in at this time. Please try again later.");
//		System.exit(0);
//	}
//		
//	}
//	
//	
//	System.out.println("Enter 1 to VIEW PAST TICKETS \n or Enter 2 to ADD A REIMBURSMENT REQUEST ");
//	String input2 = scan.nextLine();
//	
//	switch(input2) {
//	case "1": {
//
//		
//	}
//	case "2": {
//		
//	}
//	
//	}
//	
//}
//}

package com.revature.models;

import java.util.List;
import java.util.Scanner;

import com.revature.repositories.UserDAO;

//This MEnu Class will have a displayMenu() method that displays the menu to the user and lets them interact with it
//The menu will make use of the Scanner Class to take user inputs in order to travel through the menu options
public class Menu {
	
	UserDAO uDAO = new UserDAO(); //we need to instatiate this object bc we need to use methods from UserDAO
	

	//All of the menu options and control flow are contained within this method
	public void displayMenu() {

		boolean displayMenu = true; //We're suing this to toggle whether menu continues after user input
		Scanner scan = new Scanner(System.in); //Scanner object to parse (take) user input
		
		//give the user a greetings
		System.out.println("==========================================");
		System.out.println("Welcome to the Krusty Krab");
		System.out.println("==========================================");
	
		//display the menu as long as the displayMEnu boolean == true
		//this is going to hold and display all my menu options until displayMEnu  == false
		
		//menu options
		System.out.println("hi -> get greeted");
		System.out.println("employees -> show all employees");
		System.out.println("employeesById -> get employees with a certain ID");
		
		//parse user input after they choose a menu option, and put it into a String variable
		String input = scan.nextLine();
		
		//switch statement that takes the user input and executed the appropriate code
		
		switch(input) {
		
		case "hi": {
			System.out.println("Hello there! ");
			break; //we need a break in each case block, or else all the other cases will still run
			
		}
		case "employees" :{
			
			//get the List of employees from the repository layer
			List<User> users = uDAO.getUsers();
			
			//enhanced for loop to print out the user 1 by 1
			for (User u : users) {
				System.out.println(u);
			}
			
			break;
		}
		case "employeesById" :{
			System.out.println("functionality tbd");
			break;
			
		}
		
		case "exit" :{
			displayMenu = false;
			break;
		}
		
		//this default block will catch any user inputs that don't match a valid menu option
		
		default: {
			System.out.println("Invalid selection, try again :( ");
			break;
		}
		
		
		} //end of switch
	
	
	
	
	
	}
	
}


