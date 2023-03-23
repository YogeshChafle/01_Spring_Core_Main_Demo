package springdemo.yogesh.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import springdemo.yogesh.reference.A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/constructor/reference_config.xml");
		Person p1 = (Person)context.getBean("life1");
		System.out.println(p1);
	
	}

}
