package springdemo.yogesh.AutoWire.Annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Emp {
	@Autowired
	@Qualifier("add")
	//This Qualifier annotation simply call the specific bean that is mention over there
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
