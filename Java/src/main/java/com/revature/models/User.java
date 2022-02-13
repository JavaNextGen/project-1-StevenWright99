package com.revature.models;



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
public class User extends AbstractUser{
	private String fname;
	private String lname;
	private String email;
	//private int id;
	//private Role role;
	//private String username;
	//private String password;
	private int role_id;

    public User() {
        super();
    }
	
	
	
    /**
     * This includes the minimum parameters needed for the {@link com.revature.models.AbstractUser} class.
     * If other fields are needed, please create additional constructors.
     */
    
    //~~~~~~~~~~~~~~~~~~JUST UNHIGHLIGHTED~~~~~~~~~~~~~~~~~~~~~~~
//    public User(int id, String username, String password, Role role) {
//        super(id, username, password, role);
//    }
//    
//    //why is this here idk?
//    public User(int id, String username, String password, Role role, String fname, String lname, String email) {
//    	
//    }
//    
//    public User(int id, String username, String password, String fname, String lname, String email) {
//    	
//    }
//    
//    public User(int id, String fname, String lname, int role) {
//    		
//    }
//    
//    public User(String fname, String lname, int role_id) {
//    	
//    }
    
//    public User(String username, String password, String fname, String lname, String email, int role_id) {
//    	
//    }
//    //~~~~~~~~~~~~~~~~~~JUST UNHIGHLIGHTED~~~~~~~~~~~~~~~~~~~~~~~  
    
    //This constructor will hopefully set up the ers_users table from the project schema
    public User (String username, String password, String fname, String lname, String email, int id, int role_id) {
    	super(id, username, password);
    	//this.username = username;
    	//this.password = password;
    	this.fname= fname;
    	this.lname = lname;
    	this.email = email;
    	//this.id = id;
    	this.role_id = role_id;
    }
    
    //So this is the constructor that allows you to insert these values into a New User
//     public User (String username, String password, String fname, String lname, String email, int role_id) {
//    	this.username = username;
//    	this.password = password;
//    	this.fname= fname;
//    	this.lname = lname;
//    	this.email = email;
//    	this.role_id = role_id;
//    	
    
   // }
//    @Override
//	public String toString() {
//		return "Employee [employee_id=" + id + ", role_id=" + role_id + " + f_name=" + fname + ", l_name=" + lname + ", username=" + username + ", password=" + password + ", email=" + email + "]";
//	}
    
    
    public User(String username) {
		// TODO Auto-generated const ructor stub
    	super(username);
    	
	}



	public int getRole_Id() {
        return role_id;
    }

    public void setRole_Id(int role_id) {
        this.role_id = role_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
}
    

   
