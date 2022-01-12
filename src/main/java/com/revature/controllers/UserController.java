package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.revature.models.LoginDTO;
import com.revature.models.User;
import com.revature.services.UserService;

import io.javalin.http.Handler;

public class UserController {

	UserService us = new UserService();
	
	//This layer is for parsing JSON data into Java objects and vice versa
	//This is between the Javalin Front Controller and the Service Layer
	//We'll either get data from the service layer (DAOs)..
	//..or send data to the service layer (returning a successful response)
	
	
	//The method that gathers list of employees and converts to GSON
	public Handler getUsersHandler = (ctx) -> {
		if(ctx.req.getSession(false) != null) { //This just checks if the session exists
			
			List<User> allUsers = us.getUsers();
			
			//This requires adding gson dependency to xml file
			Gson gson = new Gson();
			
			//Use gson library to convert the java object to a JSON string
			String JSONUsers = gson.toJson(allUsers);
			
			//Give the response body with a JSON string
			ctx.result(JSONUsers);
			ctx.status(200);
			
			
		}else {
			ctx.result("You failed to get the employees");
			ctx.status(401);
			
		}
			
	};
	
	//This method pulls up employees by username
		public Handler getUserByUsername = (ctx) -> {
			
			String body = ctx.body();
			Gson gson = new Gson();
			User user2 = gson.fromJson(body, User.class);
			
			if(us.getByUsername(user2.getUsername()) != null) {
				
				//create a user session so that they can access the application's other functionalities
				ctx.req.getSession(); //req is a Request Object 		
				
				//String JSONUserByUsername = gson.toJson(username);
				
				ctx.result("Hello user " + user2);
				ctx.status(200);
				
				
			}else {
				ctx.result("An error occured retrieving employee by username");
				ctx.status(404);
			}
		};
//	
	//This method that allows adding of employees
	public Handler insertUsersHandler = (ctx) -> {
		
		if(ctx.req.getSession(false) != null) {
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			User user = gson.fromJson(body, User.class);
			
			us.insertUser(user);
			
			ctx.result("Employee was successfully added to the table!");
			ctx.status(201);		
			
		}else {
			ctx.result("Something went wrong adding a new user");
			ctx.status(404);
		}
			
	};
	
	
}
