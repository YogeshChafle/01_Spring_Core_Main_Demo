package springdemo.yogesh.AutoWire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("By constructor method");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
