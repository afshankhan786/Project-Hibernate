package com.project.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.project.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args){
		
		Employee emp = new Employee("ramu", "male", 055);
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.persist(emp);
		tx.commit();
	}
	
}
