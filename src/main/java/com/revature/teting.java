package com.revature;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class teting {

	public Optional<User> login(String username) {
		
		try(Connection conn = ConnectionFactory.getConnection()){ 
			ResultSet rs = null;

			String sql = "SELECT ers_username FROM ers_users;";

			Statement statement = conn.createStatement();

			rs = statement.executeQuery(sql);

			while(rs.next()) {
				User unames = new User(
						rs.getString("ers_username")
						);

				System.out.println(unames);
			}

			return null;

		} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees!");
			e.printStackTrace();
		}
 
		return null;
}
}