package in.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
import in.sp.beans.Student;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("std");
		std.display();
		System.out.println("================================================================================");
              
		Employee emp = (Employee) context.getBean("emp");
		emp.display();
	}

}
