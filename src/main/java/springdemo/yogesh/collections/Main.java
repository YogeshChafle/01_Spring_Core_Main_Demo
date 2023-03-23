package springdemo.yogesh.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/collections/emp.xml");
		Emp e = (Emp)context.getBean("emp1");
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		
	}

}
