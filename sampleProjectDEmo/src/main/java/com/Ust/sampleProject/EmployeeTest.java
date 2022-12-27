/**
 * 
 */
package com.Ust.sampleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ustjavafsdb411
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Employee e=context.getBean("emp",Employee.class);
		//Employee e=context.getBean("emps",Employee.class);
		//e.display();
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Ust.sampleProject");
		context.refresh();
		
		Order o=context.getBean(Order.class);
		
		Person p=(Person) context.getBean("person");
		
		System.out.println("order classs with setter injection :- "+o.toString());
		System.out.println("Person class with Constructor injection :- "+p.toString());
	}

}
