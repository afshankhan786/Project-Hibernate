package com.project.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.config.EmpConfiguration;
import com.project.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args){
		
		Employee emp = new Employee("ranu", "female", 5055);
		Employee emp2 = new Employee("mannu", "male", 5055);
		Employee emp3 = new Employee("vikas", "male", 5055);
		Employee emp4 = new Employee("vivek", "male", 5055);
		Employee emp5 = new Employee("suman", "female", 5055);

		 
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		
//		session.persist(emp);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		tx.commit();
		
		Query<Employee> query = session.createQuery("from empp",Employee.class);
		
		System.out.println(query.list());
		

		
//		Employee employee = session.find(Employee.class,9);
//		System.out.println(employee);
		
//		
//		Employee employee = new Employee();
//		session.load(employee,5);;
//		System.out.println(employee);


	}
	
}
