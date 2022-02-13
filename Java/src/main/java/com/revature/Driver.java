package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.controllers.AuthController;
import com.revature.controllers.UserController;
import com.revature.util.ConnectionFactory;

import io.javalin.Javalin;

public class Driver {

    public static void main(String[] args) {
    	
    	//Testing Database Connectivity
    	try(Connection conn = ConnectionFactory.getConnection()){
    		System.out.println("Connection successful :)");
    	} catch (SQLException e) {
    		System.out.println("Connection failed");
    		e.printStackTrace();
    	}  
    	  	
    	//Instantiating controller objects use their methods
    	UserController uc = new UserController();
    	AuthController ac = new AuthController();
       	    	    	
    	Javalin app = Javalin.create(
				config -> {
					config.enableCorsForAllOrigins(); // allows the server to process JS requests from anywhere
				}
			).start(3000);
    	
    	//This pulls up the list on employees on local host
    	app.get("/employee", uc.getUsersHandler);
    	
    	//This adds employees to the employee list
    	app.post("/employee", uc.insertUsersHandler);
    	
    	//Handler ending in /login to send a
    	app.post("/login", ac.loginHandler);
    	
    	//Handler to retrieve employee based on username
    	app.get("/employee/{username}", uc.getUserByUsername);
    	
    	//Handler to post a reimbursement request
    	app.post("/employee/submit", uc.submitRequestHandler);
    	
    	//Handler to show individual employee's requests
    	//app.post("/employee/view/{number}", uc.viewRequestHandler);
    	
    	//IN lieu of employees seeing requests by Id, for your frontend, just copy the manager viewing all requests list
    	
    	app.get("manager/view", uc.viewAllRequests);
    	
    	app.post("manager/status", uc.updateStatus);
    	//This is update, try in DBeaver first, then copy that method in the DAO
    	
    }
    
    
}

//Menu menu = new Menu();
//menu.displayMenu();

//Role role = Role.EMPLOYEE;
//System.out.println(role.EMPLOYEE);
    	
    	
//    	//THESE ARE THE JAVALIN DEMOS
//    	app.get("/", ctx -> {
//    		
//    		ctx.result("Hello, you have successfully set up Javalin. Keep going. Don't give up!");
//    		ctx.status(200);
//    	});
//    	
//    	// Will return whatever you enter in after localhost:3000/
//    	app.get("/hi/{name}" , ctx -> {
//    		ctx.result("Hi " + ctx.pathParam("name"));
//    		ctx.status(200);
//    	});
//    	
//    	//Will return as many inputs as necessary with successive slashes
//    	app.get("/hello/<name>" , ctx -> {
//    		ctx.result("Hello " + ctx.pathParam("name").replace("/", " "));
//    		ctx.status(200);
//    	});
//    	
//    	//Will return 1 + 'SomeString' . Will not add.
//    	app.get("/employee/{e_id}", ctx -> {
//    		ctx.result(1 + (ctx.pathParam("e_id")));
//    		ctx.status(200);
//    	});
//    	
//    	//Will return parameters after ONLY 2 slashes since you have 2 curly braces
//    	//Remember the param names are just that- names. Both 'name' and 'age' will return strings
//    	app.get("/hi/{name}/{age}" , ctx -> {
//    		ctx.result("Hi " + ctx.pathParam("name") + " " + ctx.pathParam("age"));
//    		ctx.status(200);
//    	});
//    	//THESE ARE THE JAVALIN DEMOS
    	
    	