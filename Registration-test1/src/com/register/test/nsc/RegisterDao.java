package com.register.test.nsc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.register.test.nsc.RegisterBean;;

public class RegisterDao {
	
	public int Ragistration(RegisterBean registerBean) throws ClassNotFoundException 
	{
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/register","root","" );
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO register" +"(fname,lname,email,password,contactNo)VALUES" + "(?,?,?,?,?);");
			preparedStatement.setString(1, RegisterBean.getFirstName());
			preparedStatement.setString(2, RegisterBean.getLastName());
			preparedStatement.setString(3, RegisterBean.getEmail());
			preparedStatement.setString(4, RegisterBean.getPassword());
			preparedStatement.setString(5, RegisterBean.getContactNo());
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
			
			
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
			
		}
		return result;
	}
	
	

}
