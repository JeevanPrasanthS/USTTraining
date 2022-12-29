package com.Ust.sampleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( "Hello World!" );
        
        Employee e=(Employee) context.getBean("employee");
        
        Airtel a=(Airtel) context.getBean("airtel");
        a.calling();
        a.data();
    }
}
