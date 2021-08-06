package edu.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Employee{
	public static void main(String[] args) throws SQLException {

    DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
	Connection connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/montran","root","");
	Statement st=connection.createStatement();
	ResultSet resultSet=st.executeQuery("select * from emp");

	while(resultSet.next()){
		System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getDate(5)+" "+resultSet.getFloat(6)+" "+resultSet.getInt(7)+" "+resultSet.getInt(8));
	}
}
}

