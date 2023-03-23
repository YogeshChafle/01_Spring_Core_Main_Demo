package springdemo.yogesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		student student = (student) context.getBean("student1");
		student student2 = (student)context.getBean("student2");
		System.out.println(student);
		System.out.println(student2);
}
}
