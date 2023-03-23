package springdemo.yogesh.lifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/lifecycle/xml/lifecycle_config.xml");
		student s = (student)context.getBean("life1");
		
		
		System.out.println(s);
		context.registerShutdownHook();
	}

}
