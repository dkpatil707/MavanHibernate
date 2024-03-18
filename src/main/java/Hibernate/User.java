package Hibernate;


import javax.persistence.Entity;


import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	
	//how to get a getter and setter
	//alt + s generate getter and setter selectall generate
	//how to generate toostringmethod alt+s generate tosting genrate
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	

}
