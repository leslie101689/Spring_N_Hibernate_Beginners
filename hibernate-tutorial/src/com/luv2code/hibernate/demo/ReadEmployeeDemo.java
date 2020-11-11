package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class ReadEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			System.out.println("Creating new student object...");
			
			String theDateOfJoinStr = "20/10/2020";
			Date theDateOfJoin = DateUtils.parseDate(theDateOfJoinStr); 
			Employee tempEmployee = new Employee("Daisy", "Johnson", "IBM Corp", theDateOfJoin);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			System.out.println(tempEmployee);
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			// MY NEW CODE
			
			// find out the student's id: primary key
			System.out.println("Saved student. Generated id: " + tempEmployee.getId());
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + tempEmployee.getId());
			
			Employee myEmployee = session.get(Employee.class, tempEmployee.getId());
			
			System.out.println("Get complete: " + myEmployee);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
