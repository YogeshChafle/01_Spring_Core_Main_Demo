package springdemo.yogesh.UsingAnnotation;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/UsingAnnotation/Annotation_config.xml");
		//context.registerShutdownHook();
		//System.out.println("***********");
		Student s = (Student) context.getBean("s1");
		System.out.println(s);
		System.out.println("End");
		//disposable bean method call at the end 

	}

}
