package com.cts.training.jdbc.jdbcapp;

import java.sql.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. Load driver in memory
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. Set up a connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "");
			
			// 3. Create a statement
			Statement stmt = conn.createStatement();
			 
			// insert a record
			String  query = "insert into student set name='sai', id='9'";
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);
			
			
			ResultSet rs =  stmt.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString("name") );
			}
			
			rs.close();
			conn.close();
			
			
			/*ResultSet rs = stmt.executeQuery(""); // Retrieval  : select

			if(rs.next()) {
				rs.getString(1);  // 1 based indexing
				rs.getString("email");
			}
			
			while(rs.next()) {
				
			}
			
			int n = stmt.executeUpdate(""); // DMQ/DML : insert,update,delete
			// n : number of rows affected
			 
			 */
		}
		catch(Exception ex) {
			System.out.println(ex);
			
		}
	}

}
