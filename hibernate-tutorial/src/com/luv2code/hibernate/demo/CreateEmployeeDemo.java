package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class CreateEmployeeDemo {

	public static void main(String[] args){

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a employee object
			System.out.println("Creating new student object...");
			
			String theDateOfJoinStr = "20/10/2020";
			Date theDateOfJoin = DateUtils.parseDate(theDateOfJoinStr); 
			Employee tempEmployee = new Employee("Jimmy", "King", "Google Inc", theDateOfJoin);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the employee...");
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
