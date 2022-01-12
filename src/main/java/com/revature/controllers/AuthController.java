package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.LoginDTO;
import com.revature.services.AuthService;

import io.javalin.http.Handler;



//JAN 7th DEMO WORK. 1:UNHIGHLIGHT WHEN NEEDED, 2:AS WELL AS THE BOTTOM OF AUTHSERVICE, 3:ALSO THE APP.POST IN THE DRIVER, 
public class AuthController {
	
//	AuthService as = new AuthService();
//
//	public Handler loginHandler = (ctx) -> {
//		
//		//What is the request body? (which we get from ctx.body)
//		//It is the data that gets sent in with a request
//		//GET requests will have empty request bodies, but POST requests, which send data, will have some data
//		String body = ctx.body(); //turn the body (data) of the POST request into a Java String
//		
//		Gson gson = new Gson(); //create a new Gson object to make Java to JSON conversions
//		
//		//Need an object that represents username and password together
//		//So we created the AuthController class and did stuff there
//		
//		LoginDTO LDTO = gson.fromJson(body, LoginDTO.class); //Turn the JSON string into a LoginDTO object
//		
//		//control flow to determine what happens in the event of of a successful/ unsuccessful login
//		//invoke the login() method of the AuthSerivec using the username  and password from the LoginDTO
//		if(as.login(LDTO.getUsername(),LDTO.getPassword())) {
//			//if true (in future this meaning username and password exist in the database), then create a user session
//			
//			
//			
//			//create a user session so that they can access the application's other functionalities
//			ctx.req.getSession(); //req is a Request Object 
//			
//			//return a successful status code
//			ctx.status(202);
//			
//			//send a message relaying the message
//			ctx.result("Login successful!");
//			
//		}else {
//			
//			ctx.status(401); //UNAUTHORIZZZZEEEEDDDDDD
//			ctx.result("Login unseccussful");
//		}
//	};

	AuthService as = new AuthService();

	public Handler loginHandler = (ctx) -> {
		
		//What is the request body? (which we get from ctx.body)
		//It is the data that gets sent in with a request
		//GET requests will have empty request bodies, but POST requests, which send data, will have some data
		String body = ctx.body(); //turn the body (data) of the POST request into a Java String
		
		Gson gson = new Gson(); //create a new Gson object to make Java to JSON conversions
		
		//Need an object that represents username and password together
		//So we created the AuthController class and did stuff there
		
		LoginDTO LDTO = gson.fromJson(body, LoginDTO.class); //Turn the JSON string into a LoginDTO object
		
		//control flow to determine what happens in the event of of a successful/ unsuccessful login
		//invoke the login() method of the AuthSerivec using the username  and password from the LoginDTO
		if(as.login(LDTO.getUsername())) {
			//if true (in future this meaning username and password exist in the database), then create a user session
			
			
			
			//create a user session so that they can access the application's other functionalities
			ctx.req.getSession(); //req is a Request Object 
			
			//return a successful status code
			ctx.status(202);
			
			//send a message relaying the message
			ctx.result("Login successful!");
			
		}else {
			
			ctx.status(401); //UNAUTHORIZZZZEEEEDDDDDD
			ctx.result("Login unsuccessful");
		}
	};
}

