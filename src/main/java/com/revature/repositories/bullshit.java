package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.Scanner;

import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class bullshit {
	
	public static void main(String[] args) {
		
		
		
		//Scanner scan = new Scanner(System.in);
		String username = "kittypurrbing";
		
try(Connection conn = ConnectionFactory.getConnection()){ //all of my SQL stuff will be within this try block
			
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String sql = "SELECT * FROM ers_users WHERE ers_username = ? ";
			ps = conn.prepareStatement(sql);		
			ps.setString(1, username);
			//ps.setString(2, x);
			//rs = ps.executeQuery();
			
//					
			rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString(1));
					System.out.println("user found");
					
					//DEbatable if I need this really
//					User unames = new User(
//							rs.getString("ers_username"),
//							rs.getString("ers_password"),
//							rs.getString("user_first_name"),
//							rs.getString("user_last_name"),
//							rs.getString("user_email"),
//							rs.getInt("ers_users_id"),
//							rs.getInt("ers_user_role_id")
//							);
//					System.out.println(unames);
				
				
				}else {
				System.out.println("User not found");
			
			}
				
		} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees!");
			e.printStackTrace();
		}
	}

}
