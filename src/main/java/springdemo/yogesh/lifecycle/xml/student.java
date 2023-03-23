package springdemo.yogesh.lifecycle.xml;

public class student {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void setPrice(int price) {
		System.out.println("setting value");
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "student [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	

}
