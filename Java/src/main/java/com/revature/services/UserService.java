package com.revature.services;

import java.util.List;
import java.util.Optional;

import com.revature.models.Reimbursement;
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
		
			
	//Try CODE
		
//	If the user's username is present in the database, return the username		
	
		Optional<User> user = uDAO.getByUsername(username); 		
		
		return user;
		//return Optional.ofNullable(uDAO.getByUsername(username).get()); 
		

//   Try CODE
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
		
		//we need to write the DAO method that inserts the new USer.... so go do that
		//Done, so now call the DAO method and then call this class (UserService in the menu)
		
		uDAO.insertUser(newUser); 
		
	}
	
	public void submitRequest(Reimbursement newReimbursement) {
		
		uDAO.submitRequest(newReimbursement);
	}
	
	
	public void updateStatus(Reimbursement newStatus) {
		
		uDAO.updateStatus(newStatus);
	}
	
	public List<Reimbursement> viewAllRequests() {
		
		List<Reimbursement> viewAll = uDAO.viewAllRequests();
		
		return viewAll;
	}
	
	
//	public List<Reimbursement> getReimbById(int id){
//		
//		//List<Reimbursement> reimb = 
//		uDAO.getReimbById(id);
//		
//		return IdList;
//		
//		
//	}
	
}
