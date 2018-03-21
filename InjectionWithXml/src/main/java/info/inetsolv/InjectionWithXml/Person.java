package info.inetsolv.InjectionWithXml;

public class Person {
	
	private Integer pid;
	private String name;
	private Double marks;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person()
	{
		System.out.println("person object created");
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}

}
