package springdemo.yogesh.collections;

import java.util.*;

public class Emp {
	private String name;
	private List<String> phoneNo;
	private Set<String> address;
	private Map<String,String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Emp(String name, List<String> phoneNo, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", course=" + course + "]";
//	}
	
	

}
