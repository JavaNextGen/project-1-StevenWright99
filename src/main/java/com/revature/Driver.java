package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.models.Menu;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class Driver {

    public static void main(String[] args) {
    	
    	//Testing Database Connectivity
    	try(Connection conn = ConnectionFactory.getConnection()){
    		System.out.println("Connection successful :)");
    	} catch (SQLException e) {
    		System.out.println("Connection failed");
    		e.printStackTrace();
    	}
    	
    	
    	
//    	Menu menu = new Menu();
//    	menu.displayMenu();
    	
    	//Role role = Role.EMPLOYEE;
    	//System.out.println(role.EMPLOYEE);
    }
}
