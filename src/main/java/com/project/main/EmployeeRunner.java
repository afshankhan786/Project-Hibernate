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
		

		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		

//		MutationQuery namedQuery = session.createNamedMutationQuery("updateAnEmployee");
//		namedQuery.setParameter("n", "Karan");
//		namedQuery.setParameter("i", 16);
//		namedQuery.executeUpdate();
		
		MutationQuery namedQuery = session.createNamedMutationQuery("deleteEmployeeById");
		namedQuery.setParameter("i", 15);
		namedQuery.executeUpdate();
		tx.commit();


		Query query1 = session.createQuery("from empp", Employee.class);
		List list = query1.list();
		System.out.println(list);
		session.close();



	}
	
}
