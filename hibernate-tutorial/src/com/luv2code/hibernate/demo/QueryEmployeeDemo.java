package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class QueryEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			//query employees
			List<Employee> theEmployees = session.createQuery("from Employee").getResultList();
			
			//display the employees
			displayEmployees(theEmployees);
			
			// query employees: lastName='Wall'
			theEmployees = session.createQuery("from Employee s where s.lastName='Wall'").getResultList();
			
			// display the employees
			System.out.println("\n\nEmployees who have last name of Wall");
			displayEmployees(theEmployees);
			
			// query employees: lastName='Wall' OR firstName='Daisy'
			theEmployees = 
					session.createQuery("from Employee s where"
							+ " s.lastName='Wall' OR s.firstName='Daisy'").getResultList();
			
			System.out.println("\n\nEmployees who have last name of Wall OR first name of Daisy");
			displayEmployees(theEmployees);
			
			// query employees where company LIKE 'Corp'
			theEmployees = session.createQuery("from Employee s where"
					+ " s.company LIKE '%Corp'").getResultList();
			System.out.println("\n\nEmployees who have email ends with Corp");
			displayEmployees(theEmployees);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

	private static void displayEmployees(List<Employee> theEmployees) {
		for (Employee tempEmployee : theEmployees) {
			System.out.println(tempEmployee);			
		}
	}

}
