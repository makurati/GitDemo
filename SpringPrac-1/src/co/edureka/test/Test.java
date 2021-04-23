package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.User;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		User u= (User) context.getBean("user");
		System.out.println("The car details are:"+u.getCar().getName()+":"+u.getCar().getCost());
		
	}

}
