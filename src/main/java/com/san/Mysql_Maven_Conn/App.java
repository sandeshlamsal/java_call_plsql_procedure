package com.san.Mysql_Maven_Conn;

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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","test","test");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
			catch(Exception e){ 
				System.out.println(e);  
			}  	
    }
}
