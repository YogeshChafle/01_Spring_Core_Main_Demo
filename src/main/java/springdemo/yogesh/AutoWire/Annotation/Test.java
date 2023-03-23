package springdemo.yogesh.AutoWire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/AutoWire/Annotation/AutoWire_config.xml");
		Emp em = context.getBean("emp" , Emp.class);
		System.out.println(em);
		//byName it check the reference with the name of the bean
		//byType it check the name of the reference variable with name of class
		//constructor it will call the by using constructor

	}

}
