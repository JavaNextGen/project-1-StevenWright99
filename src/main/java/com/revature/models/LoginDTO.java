package com.revature.models;

//So a DTO (Data Transfer Object) is a model of some data coming from the client (front end)
//An HTTP handler will parse a JSON object sent by the user, containing their username and password
//This then gets sent to the controller to get turned into a Java object (using GSON)
//The username and password will then be put into the DTO as fields (see fields below), which will get checked by the service
//You NEVER store a DTO in the database. It's purely for data transfer... we're transferring the username/password
public class LoginDTO {

	//our LoginDTO models ONLY the username/password of our users
	private String username;
	private String password;
	
	
	//Then we just need 2 constructors to instatiate this class and transfer data with it
	//So alt+shift+s
	//Generate both constructors 
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	//Also generate getters and setters in order to access our fields

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	//toString just for debugging purposes so we can print out our object
	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
