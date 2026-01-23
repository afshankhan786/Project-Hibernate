package com.project.main;

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
import com.project.entity.Employee;

public class EmployeeRunner {
	
	public static void main(String[] args){
		

		Employee emp = new Employee("Vimla", "FeMale", 64548);		

		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		
		
//		Query<Employee> query = session.createQuery("from empp",Employee.class);
//		System.out.println(query.list());



	}
	
}
