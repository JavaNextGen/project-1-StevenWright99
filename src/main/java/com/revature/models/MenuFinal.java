package com.revature.models;

import java.util.Scanner;

import com.revature.services.AuthService;
import com.revature.services.ReimbursementService;
import com.revature.services.UserService;

public class MenuFinal {

	//We will need these objects instantiated in order to use their methods later on in the menu
	UserService us = new UserService();
	AuthService as = new AuthService();
	ReimbursementService rs = new ReimbursementService();
		
		//All of the menu options will be contained in this method
		public void displayMenu() {
			
			//Giving this a boolean I believe will help the while loop stay open?
			boolean displayMenu = true;
			//Do we need a scanner anymore?
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome to the Employee Reimbursement System");
			
			
		}

	}


