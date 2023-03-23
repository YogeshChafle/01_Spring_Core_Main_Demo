package springdemo.yogesh.UsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//This method similar to init
		System.out.println("Drinking pepsi");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//This method is similar to destoy method
		System.out.println("Putting bottle in the Dustbin");
		
	}
	
	

}
