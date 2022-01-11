package com.revature.services;

import java.util.List;
import java.util.Optional;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

/**
 * The UserService should handle the processing and retrieval of Users for the ERS application.
 *
 * {@code getByUsername} is the only method required;
 * however, additional methods can be added.
 *
 * Examples:
 * <ul>
 *     <li>Create User</li>
 *     <li>Update User Information</li>
 *     <li>Get Users by ID</li>
 *     <li>Get Users by Email</li>
 *     <li>Get All Users</li> 
 * </ul>
 */


public class UserService {
	
	UserDAO uDAO = new UserDAO();

	/**
	 *     Should retrieve a User with the corresponding user name or an empty optional if there is no match.
     */
	
	
	
	
	public Optional<User> getByUsername(String username) {
		
			
	//EILISE CODE
	if(uDAO.getByUsername(username).isPresent()) {
		
		//User user = new User();
		
	//	user.setUsername(username);
		
		
		return Optional.ofNullable(uDAO.getByUsername(username).get()); 
		
	} else return Optional.ofNullable(null);
	
//   EILISE CODE
	}
	
	
	
	
	
	
	
	//This method is for retrieving a list of users
	
	 //so that I can use the methods from UserDAO
	
	public List<User> getUsers() {
		
		//get the List of users by calling the DAO method that selects them from the database
		List<User> users = uDAO.getUsers();
		
		//returns the list of employees
		return users;
	} 
	
	
	
	public void insertUser(User newUser) {
		
		//take in the user object send from the menu(add user option) and send it to the UserDAO to be inserted into the database

		//we need to write the DAO method that inserts the new USer.... so go do that
		//Done, so now call the DAO method and then call this class (UserService in the menu)
		
		uDAO.insertUser(newUser); 
	
	
	
	
}
}