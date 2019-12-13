package com.cpg.application.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("Enter DB user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="select * from ContactFile";
		
		try(Connection conn=DriverManager.getConnection(dbUrl,user,password)){
			Statement stmt=(Statement) conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Contactname:"+rs.getString(1));
				System.out.println("Contactnumber"+rs.getInt("contactnumber"));
				System.out.println("Groupname"+rs.getString(3));
				
			}
			sc.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
