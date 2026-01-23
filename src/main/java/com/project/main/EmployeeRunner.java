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
	
	public static void delById(int id, Session session) {
		
//		HQL delete query
		MutationQuery query=session.createMutationQuery("delete from empp where id = :id");  
		query.setParameter("id", 4);
		query.executeUpdate();  
		
	}

	public static void main(String[] args){
		
		Employee emp = new Employee("ranus", "male", 5055);
		Employee emp1 = new Employee("Avya", "FeMale", 64548);
		Employee emp2 = new Employee("Nitin", "FeMale", 64548);
		Employee emp3 = new Employee("Neelam", "FeMale", 64548);
		Employee emp4 = new Employee("Jack", "Male", 64548);
		Employee emp5 = new Employee("Petar", "Male", 64548);
		Employee emp6 = new Employee("Sam", "Male", 64548);

		 
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		session.persist(emp);
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);
		
//		Example of HQL to get all the records
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list=query1.list();  
//		System.out.println(list);
//		
//		HQL to get records with pagination
//		query1.setFirstResult(2);
//		query1.setMaxResults(5);
//		System.out.println(query1.list());
		
		
		
		
//		Query q=session.createQuery("select min(name) from empp");  
//		List list1=q.list();  
//		System.out.println(list1);  
		
		
//		HQL update query Using Named Parameters
//		MutationQuery mutationQuery=session.createMutationQuery("update empp set name=:n where id=:i");  
//		mutationQuery.setParameter("n","Afan");  
//		mutationQuery.setParameter("i",5);  
//		System.out.println("status: "+mutationQuery.executeUpdate());  

//		HQL delete query
//		MutationQuery query=session.createMutationQuery("delete from empp where id = 5");  
//		query.executeUpdate();  
		
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list=query1.list();  
//		System.out.println(list);
		

		tx.commit();
		session.close();


	}
	
}
