package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBase {
	@Test
	public void connect() throws SQLException {
		String uname="root";
		String pwd="root";
		String url="jdbc:mysql://localhost:3306/sakila";
		String qurey="select * from actor;";
		
		Connection a = DriverManager.getConnection(url, uname, pwd);
		Statement b = a.createStatement();
		ResultSet e = b.executeQuery(qurey);
		
		for(int i=0; i<200;i++) {
			e.next();
			System.out.print(e.getString(1));
			System.out.print("     "+e.getString(2));
			System.out.print("     "+e.getString(3));
			System.out.print("     "+e.getString(4));
			System.out.println();
		}
	}

}
