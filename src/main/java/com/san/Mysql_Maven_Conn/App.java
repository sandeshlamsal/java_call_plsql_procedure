package com.san.Mysql_Maven_Conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{  
			Class.forName("com.mysql.jdbc.Driver");  //or use com.mysql.jc.jdbc.Driver as new driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","test","test");  
			//here sonoo is database name, root is username and password  
			//Statement stmt=con.createStatement();  
			
			CallableStatement statement = con.prepareCall("{call add_productlines()}");
			statement.execute();
			statement.close();
			//ResultSet rs=stmt.executeQuery("select * from employees");  
			//while(rs.next())  
			//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			 System.out.println("Stored procedure called successfully!");  
			}
			catch(Exception e){ 
				System.out.println(e);  
			}  	
    }
}
