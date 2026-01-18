package com.project.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		Employee ravi = new Employee(9, "Savi Gupta", "Male", 87000);


		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root").createStatement().executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		
		
		
		System.out.println("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed...............");

	}

}

/*
 
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		Employee ravi = new Employee(8, "Ravi Gupta", "Male", 67000);

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		Statement statement = connection.createStatement();

		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
//		statement.executeUpdate("insert into employee(id,name,gender,salary) values (8,'Ravi Gupta','male',67000)");

		System.out.println("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed...............");

	}

}

  
  */



//second 


/*
 
 package com.keshav.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		Employee ravi = new Employee(10, "Aman Gupta", "Male", 67000);
		
//		Way-2
		Properties ps = new Properties();
		ps.put("user", "root");
		ps.put("password", "root");
		

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", ps);

		Statement statement = connection.createStatement();

		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		
		
		System.out.println("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed...............");

	}

}
 
 */


// three


/*
 
  
  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.keshav.entity.Employee;
import com.mysql.cj.jdbc.Driver;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		Employee ravi = new Employee(11, "Sukoon", "Male", 67000);
		
//		Way-3
		Properties ps = new Properties();
		ps.put("user", "root");
		ps.put("password", "root");
		Connection connection = new Driver().connect("jdbc:mysql://localhost:3306/mydb", ps);
		Statement statement = connection.createStatement();
		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		
		
		System.out.println("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed...............");

	}

}
  
  
*/







