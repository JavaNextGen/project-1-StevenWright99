package com.revature.models;

import java.util.Scanner;

/**
 * This concrete User class can include additional fields that can be used for
 * extended functionality of the ERS application.
 *
 * Example fields:
 * <ul>
 *     <li>First Name</li>
 *     <li>Last Name</li>
 *     <li>Email</li>
 *     <li>Phone Number</li>
 *     <li>Address</li>
 * </ul>
 *
 */
public class User extends AbstractUser {
	private String fname;
	private String lname;
	private String email;
	private int id;
	private Role role;
	private String username;
	private String password;
	private int role_id;

    public User() {
        super();
    }
    /**
     * This includes the minimum parameters needed for the {@link com.revature.models.AbstractUser} class.
     * If other fields are needed, please create additional constructors.
     */
    public User(int id, String username, String password, Role role) {
        super(id, username, password, role);
    }
    
    //why is this here idk?
    public User(int id, String username, String password, Role role, String fname, String lname, String email) {
    	
    }
    
    public User(int id, String username, String password, String fname, String lname, String email) {
    	
    }
    
    public User(int id, String fname, String lname, int role) {
    	
    	
    }
    //This constructor will hopefully set up the ers_users table from the project schema
    public User (String username, String password, String fname, String lname, String email, int id, int role_id) {
    	this.username = username;
    	this.password = password;
    	this.fname= fname;
    	this.lname = lname;
    	this.email = email;
    	this.id = id;
    	this.role_id = role_id;
    	
    }
    @Override
	public String toString() {
		return "Employee [employee_id=" + id + ", role_id=" + role_id + " + f_name=" + fname + ", l_name=" + lname + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
}
    
    
 //   public void displayMenu(){
    
    	//OLD DUMB WAY OF GETTING USER INPUT FOR THE FIELDS ABOVE
//    	//scanner scan = new Scanner(System.in);
//    	//System.out.println("Enter a username");
//    	//username=scan.nextLine();
    	
    	
    	
//    	System.out.println("What is your first name?");
//    	fname=scan.nextLine();
//    	System.out.println("Your first name is " + fname + "\n");
//    	
//    	System.out.println("What is your last name?");
//    	lname=scan.nextLine();
//    	System.out.println("Your last name is " + lname + "\n");
//
//    	System.out.println("Enter your email address");
//    	email=scan.nextLine();
//    	System.out.println("Your email address is: " + email + "\n");
//    	
//    	System.out.println("Enter your phone number");
//    	pnum=scan.nextLine();
//    	System.out.println("Your phone number is: " + pnum + "\n");
//    	
//    	System.out.println("Enter your home address");
//    	address=scan.nextLine();
//    	System.out.println("Your home address is: " + address + "\n");
    	
    	
   
