package com.project.main;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import com.project.config.EmpConfiguration;
import com.project.entity.Address;
import com.project.entity.Employee;

public class EmployeeRunner {
	
	public static void main(String[] args){

//		Employee emp = new Employee();
//		emp.setName("Bimla");
//		emp.setGender("Male");
//		emp.setSalary(50000);
			
		
//		Address add1 = new Address();
//		add1.setCity("GZB");
//		add1.setState("UP");
//		add1.setEmployee(emp);
//		
//		Address add2 = new Address();
//		add2.setCity("GZB");
//		add2.setState("UP");
//		add2.setEmployee(emp);
//		
//		Address add3 = new Address();
//		add3.setCity("Lucknow");
//		add3.setState("UP");
//		add3.setEmployee(emp);
		

		
//		ArrayList<Address> listofAddresses = new ArrayList<>();
//		listofAddresses.add(add1);
//		listofAddresses.add(add2);
//		listofAddresses.add(add3);
//
//		emp.setAddresses(listofAddresses);
		
		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		session.persist(emp);
//		tx.commit();
		
//		Employee employee = session.find(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(employee.getAddresses());
		
		
		Address address = session.find(Address.class,2);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
		
	}
	
}
