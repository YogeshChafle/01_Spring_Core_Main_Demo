package springdemo.yogesh.UsingInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/UsingInterface/lifecycle_config.xml");
		context.registerShutdownHook();
		System.out.println("***********");
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		System.out.println("End");
		//disposable bean method call at the end 

	}

}
