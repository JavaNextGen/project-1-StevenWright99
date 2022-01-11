package com.revature.repositories;

import com.revature.models.LoginDTO;
//import com.revature.models.User;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO {

    /**
     * Should retrieve a User from the DB with the corresponding username or an empty optional if there is no match.
     */
//    public Optional<User> getByUsername(String username) {
//        return Optional.empty();
//   }

    /**
     * <ul>
     *     <li>Should Insert a new User record into the DB with the provided information.</li>
     *     <li>Should throw an exception if the creation is unsuccessful.</li>
     *     <li>Should return a User object with an updated ID.</li>
     * </ul>
     *
     * Note: The userToBeRegistered will have an id=0, and username and password will not be null.
     * Additional fields may be null.
     */
//    public User create(User userToBeRegistered) {
//        return userToBeRegistered;
//    }
	
//		public List<User> getUsers() { //This will use SQL SELECT functionality
//			
//			try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff gies in this try block
//				
//			//Initialize an empty resultSet object to store the results of our SQL query
//			ResultSet rs = null;
//			
//			//write the query that we want to send to the database, and assign it to a String
//			String sql = "SELECT * FROM employees;";
//			
//			//Put the SQL query into a statement object (The Connection object has a method for this)
//			Statement statement = conn.createStatement();
//			
//			//EXECUTE the QUERY, by putting the results of the query into our ResltSet object
//			//The statement object has a method that takes Strings to execute as a a SQL qurey
//			
//			rs = statement.executeQuery(sql);
//			
//			//All the code above makes a coll to your database.. now we need to store the data in an ArrayList
//			
//			//create an empty List to be filled with the data from the database
//			List<User> userList = new ArrayList<>();
//			
//			//While there are results in the ResultSet...
//			while(rs.next()) {
//				
//				//Use the all-args constructor to create a new User object from each returned row from the DB
//				User u = new User(
//						//we want to use rs.get for each column in the record
////						
//						
//						//Test code -remove later
//						rs.getInt("employee_id"),
//						rs.getString("f_name"),
//						rs.getString("l_name"),
//						rs.getInt("role_id")
//						);
//						//Test code - remove later
//						
//						
//						
//						
//						
//		//				rs.getInt("ers_users_id"),
////						rs.getString("ers_username"),
////						rs.getString("ers_password"),
////						rs.getString("user_first_name"),
////						rs.getString("user_last_name"),
////						rs.getString("user_email")			
////						);
//				
//				//and the populate the ArrayList with each new Employee object
////				userList.add(u); //u  is the new employee/user object we created above
//			}
//			
//			//when there are no more results in the rs, the while loop will break
//			return userList;
//			
//				
//				
//			}catch (SQLException e) {
//				System.out.println("Something went wrong selcting users");
//				e.printStackTrace();
//			}
//			
//			return null; //we add this after the try/catch block, so Java won't yell;
//			//Since there's no guarantee that the try will run
//		}
//	
//	
	
	///This methods selects all users from the database
	public List<User> getUsers() { //This will use SQL SELECT functionality
		
		try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff will be within this try block
			
			//Initialize an empty ResultSet object that will store the results of our SQL query
			ResultSet rs = null;
			
			//write the query that we want to send to the database, and assign it to a String
			String sql = "SELECT * FROM ers_users;";
					
			//Put the SQL query into a Statement object (The Connection object has a method for this!!)
			Statement statement = conn.createStatement();
			
			//EXECUTE THE QUERY, by putting the results of the query into our ResultSet object
			//The Statement object has a method that takes Strings to execute as a SQL query
			rs = statement.executeQuery(sql);
			
			//All the code above makes a call to your database... Now we need to store the data in an ArrayList.
			
			//create an empty ArrayList to be filled with the data from the database
			List<User> userList = new ArrayList<>();
			
			//while there are results in the resultset...
			while(rs.next()) {
				
				//Use the all args constructor to create a new Employee object from each returned row from the DB
				User u = new User(
						//we want to use rs.get for each column in the record
						rs.getString("ers_username"),
						rs.getString("ers_password"),
						rs.getString("user_first_name"),
						rs.getString("user_last_name"),
						rs.getString("user_email"),
						rs.getInt("ers_users_id"),
						rs.getInt("ers_user_role_id")
						);
				
				//and populate the ArrayList with each new Employee object
				userList.add(u); //e is the new Employee object we created above
		
			}
						
			//when there are no more results in rs, the while loop will break
			//then, return the populated ArrayList of Employees
			return userList;
			
		} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees!");
			e.printStackTrace();
		}
		
		return null; //we add this after the try/catch block, so Java won't yell
		//(Since there's no guarantee that the try will run)
		
	}
	
	//~~~~~~~~~~~~~~~~~~~~
	//login
	//~~~~~~~~~~~~~~~~~~~~~~
	
	public Optional<LoginDTO> login(String username) {
		
		try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff will be within this try block
			
			ResultSet rs = null;
			//WHAT IS SUPPOSED TO WORK
			String sql = "SELECT * FROM ers_users WHERE ers_username = ? ";

			PreparedStatement ps = conn.prepareStatement(sql);
			
			LoginDTO log = new LoginDTO();
			
			ps.setString(1, log.getUsername());
			
			
		//	System.out.println();
			return Optional.ofNullable();
				
			
			}catch (SQLException e) {
				System.out.println("Uh oh");
				e.printStackTrace();
			}
		
		
		return null;
		}



	
	
	public Optional<User> getByUsername2(String username) { //This will use SQL SELECT functionality
		
		try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff will be within this try block
			
			//Initialize an empty ResultSet object that will store the results of our SQL query
			ResultSet rs = null;
			
			//write the query that we want to send to the database, and assign it to a String
			
			//WHAT IS SUPPOSED TO WORK
			String sql = "SELECT * FROM ers_users WHERE ers_username = ? ";
					
			//Put the SQL query into a Statement object (The Connection object has a method for this!!)
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//EXECUTE THE QUERY, by putting the results of the query into our ResultSet object
			//The Statement object has a method that takes Strings to execute as a SQL query
			//PS
	
			//All the code above makes a call to your database
		
			ps.setString(1, username);
			rs = ps.executeQuery();
			while(rs.next()) {
				User unames = new User(
						rs.getString("ers_username"),
						rs.getString("ers_password"),
						rs.getString("user_first_name"),
						rs.getString("user_last_name"),
						rs.getString("user_email"),
						rs.getInt("ers_users_id"),
						rs.getInt("ers_user_role_id")
						);
				
				System.out.println(unames);
				
				return Optional.ofNullable(unames);
				
			
			}
		
				
		} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees!");
			e.printStackTrace();
		}
		
		return Optional.ofNullable(null); //we add this after the try/catch block, so Java won't yell
		//(Since there's no guarantee that the try will run)
		
	}
	

	//~~~~~~~~~~~~~~~~~~~~First try at Optionals~~~~~~~~~~~~~~~~~`
	
//public Optional<User> getUserByUsername() {
//		
//		try(Connection conn = ConnectionFactory.getConnection()) {
//			
//			ResultSet rs = null;
//			
//			String sql = "SELECT ers_username FROM ers_users";
//			
//			Statement statement = conn.createStatement();
//			
//			rs =statement.executeQuery(sql);
//			
//			Optional<User> usernameList = Optional.empty();
//			
//			while(rs.next()) {
//		
//				//Use the all args constructor to create a new Employee object from each returned row from the ers_username column
//				User uname = new User(
//						//we want to use rs.get for each column in the record
//						rs.getString("ers_username")
//						);
//				
//				//and populate the Optional? with each new User object
//				usernameList.isPresent(); //this will carry out if the username is present
//				usernameList.isEmpty();
//		
//			}
//						
//			//when there are no more results in rs, the while loop will break
//			//then, return the populated ArrayList of Employees
//			return Optional.ofNullable(uname);
//		
//		}catch (SQLException e) {
//			System.out.println("Something went wrong selecting this specific user");
//			e.printStackTrace();
//		}
//		
//		return Optional.ofNullable(null);
//	};
	
	

	//This method takes in a User object called newUser and will insert it into my database
	//This was established in the menu class under the add option, and then built upon in the UserService class and this class (UserDAO) for layered functionality
	public void insertUser(User newUser) {
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			//we'll create a SQL statement using parameters to insert a new User
			String sql = "INSERT INTO ers_users(ers_username, ers_password, user_first_name, user_last_name, user_email, ers_user_role_id) " //ers_user_role_id
					+ "VALUES (?, ?, ?, ?, ?, ?); "; //the ?s are parameters, which means we have to specify the value of each '?' How? PreparedStatement
			
			PreparedStatement ps = conn.prepareStatement(sql); //we use PS for SQL commands with variables
			
			//use the PreparedStatement objects' methods to insert values into the query's ?s
			//the values will come from the User object we send in
			ps.setString(1, newUser.getUsername());
			ps.setString(2, newUser.getPassword());		
			ps.setString(3, newUser.getFname());
			ps.setString(4, newUser.getLname());	
			ps.setString(5, newUser.getEmail());
			ps.setInt(6, newUser.getRole_Id());
			
			//this executeUpdate method sends and executes the SQL command we built
			ps.executeUpdate(); //we use executeUpdate for inserts, updates, and deletes
			//we use executeQuery() for selects
			
			//send confirmation to the console if successful
			System.out.println("User " + newUser.getFname() + " has been successfully added");
			
			
			
		} catch(SQLException e) {
			System.out.println("Failed to add new User");
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public Optional<String> getByUsername() { //This will use SQL SELECT functionality

		try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff will be within this try block

			//Initialize an empty ResultSet object that will store the results of our SQL query
			ResultSet rs = null;

			//write the query that we want to send to the database, and assign it to a String

			//WHAT IS SUPPOSED TO WORK
			String sql = "SELECT ers_username FROM ers_users;";

			//Put the SQL query into a Statement object (The Connection object has a method for this!!)
			Statement statement = conn.createStatement();

			//EXECUTE THE QUERY, by putting the results of the query into our ResultSet object
			//The Statement object has a method that takes Strings to execute as a SQL query
			rs = statement.executeQuery(sql);

			//All the code above makes a call to your database

			while(rs.next()) {
				User unames = new User(
						rs.getString("ers_username")
						);

				Optional<String> username = Optional.ofNullable(unames.getUsername());
				System.out.println(username);
			}





			return Optional.ofNullable("yo");

		} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees!");
			e.printStackTrace();
		}

		return null; //we add this after the try/catch block, so Java won't yell
		//(Since there's no guarantee that the try will run)

	}

	
}










