package springdemo.yogesh.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemo/yogesh/reference/reference_config.xml");
		A temp = (A)context.getBean("refA");
		System.out.println(temp.getA());
		
		//System.out.println(temp);
		
		
		System.out.println(temp.getObj().getB());
	}

}
